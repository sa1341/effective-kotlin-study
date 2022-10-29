package file

import java.io.FileNotFoundException
import java.io.IOException
import java.nio.file.*
import java.nio.file.attribute.BasicFileAttributes

fun main(args: Array<String>) {

    val fileList: MutableList<String> = mutableListOf()
    val dirList: MutableList<String> = mutableListOf()

    val filePath = "/Users/limjun-young/workspace/privacy/dev/test"
    val path: Path = Paths.get(filePath)

    println("is File exist? = ${hasFile(path)}")

    Files.walkFileTree(path, object : SimpleFileVisitor<Path>() {
        override fun visitFile(file: Path, attrs: BasicFileAttributes?): FileVisitResult {

            fileList.add(file.toUri().toString())

            /*if (!Files.isDirectory(file)) {
                fileList.add(file.toUri().toString())
            }*/

            return FileVisitResult.CONTINUE
        }

        override fun postVisitDirectory(dir: Path, exc: IOException?): FileVisitResult {
            dirList.add(dir.toUri().toString())
            return FileVisitResult.CONTINUE
        }
    })

    println("File Size = ${fileList.size}")

    fileList.forEach {
        println("path = $it")
    }

    println("Directory Size = ${dirList.size}")
    dirList.forEach {
        println("path = $it")
    }
}


@Throws(FileNotFoundException::class)
inline fun hasFile(path: Path) {
    if (!Files.exists(path)) {
        throw FileNotFoundException("해당 파일이 존재하지 않습니다. ${path.toUri()}")
    }
}