package chapter01

fun main(args: Array<String>) {
    val person = Person(email = "a79007714@gmail.com")
    sendEmail(person, "Hi jeancalm")
}


fun sendEmail(person: Person, message: String) {
        val email: String = person.email ?: run {
        println("Email not send, no email address")
        return
    }

    println("$message My email is ${person.email}")
}


class Person(val email: String?)




