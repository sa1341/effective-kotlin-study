package chapter01

fun main(args: Array<String>) {

    val pair = updateWeather(5)
    println("pair = $pair")
}


fun updateWeather(degrees: Int): Pair<String, Color> {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mid" to Color.YELLOW
        else -> "cold" to Color.RED
    }

    return Pair(description, color)
}

enum class Color {
    BLUE,
    YELLOW,
    RED;
}


