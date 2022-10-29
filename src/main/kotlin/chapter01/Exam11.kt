package chapter01

import java.io.File

fun main(args: Array<String>) {
    val path = "/Users/limjun-young/study/file/test-1022.txt"
    println("total line = ${countCharactersInFile(path)}")


}

fun countCharactersInFile(path: String): Int {

    File(path).useLines { lines ->
        lines.forEach { println(it) }
    }

    File(path).useLines { lines ->
        return lines.sumBy { it.length }
    }
}