package chapter01

fun main(args: Array<String>) {
    var user = User("Maja", "Markiewcz")
    user = user.copy(surname = "jeancalm")
    println("user = $user")
}

data class User (
    val name: String,
    val surname: String
)


