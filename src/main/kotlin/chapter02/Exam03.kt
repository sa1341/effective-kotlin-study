package chapter02

const val MIN_PASSWORD_LENGTH = 7

fun main(args: Array<String>) {

    val forest = Forest<Birch>()
    forest.addTree(Birch())
    forest.addTree(Spruce())
}

fun isPasswordValid(text: String): Boolean {

    if (text.length < MIN_PASSWORD_LENGTH) {
        return false
    }

    return true
}