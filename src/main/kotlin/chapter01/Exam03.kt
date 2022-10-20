package chapter01

fun main(args: Array<String>) {

    val name = Name()
    println(name.fullName)
    name.name = "jeancalm"
    println(name.fullName)
}

class Name {

    var name: String = "Marcin"
    var surname: String = "Moskala"

    val fullName
        get() = "$name $surname"
}

interface Element {
    val active: Boolean
}

class ActualElement: Element {
    override var active: Boolean = false
}


