package chapter02

fun main(args: Array<String>) {
    val s = (1..10).joinToString(separator = "|")
    println("s = $s")
}