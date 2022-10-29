package chapter02

interface Tree {
    fun printInfo()
}

class Birch : Tree {
    override fun printInfo() = println("Birch")
}

class Spruce : Tree {
    override fun printInfo() = println("Spruce")
}

/**
 * 타입 파라미터의 새도잉을 피합시다.
 * 아래와 같이 제네릭을 잘못사용하면 Forest와 addTree의 타입 파라미터가 독립적으로 동작하게 됩니다.
 *
 * 참고: https://devlog-wjdrbs96.tistory.com/201
 */

/*
class Forest<T : Tree> {
    fun <T : Tree> addTree(tree: T) {
        tree.printInfo()
    }
}
*/


class Forest<T : Tree> {
    fun <T : Tree> addTree(tree: T) {
        tree.printInfo()
    }
}

fun main(args: Array<String>) {

    val forest = Forest<Birch>()
    forest.addTree(Birch())
    forest.addTree(Spruce())

}