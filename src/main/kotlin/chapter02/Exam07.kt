package chapter02

fun main(args: Array<String>) {

    val names = listOf<User>(
        User("lucas", "calm"),
        User("kai", "calm")
    )

    val sorted = names.sortedBy { it.surname }

    println("sorted = $sorted")

    val sorted2 = names.sortedWith(User.DISPLAY_ORDER)
    println("sorted2 = $sorted2")
}

data class User(val name: String, val surname: String) {

    companion object {
        val DISPLAY_ORDER = compareBy(User::surname, User::name)
    }
}

class User2(
    val name: String,
    val surname: String
): Comparable<User2> {
    override fun compareTo(other: User2): Int =
        //compareValues(surname, other.surname)
        compareValuesBy(this, other, {it.surname}, {it.name})
}
