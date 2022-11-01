package chapter02

import java.util.*

data class FullName (
    var name: String,
    var surname: String
)

fun main(args: Array<String>) {
    val person = FullName("jean", "calm")
    val set = mutableSetOf<FullName>()
    set.add(person)

    person.surname = "Junyoung"

    println(person)

    println(person in set)
    println(set.first() == person)
}