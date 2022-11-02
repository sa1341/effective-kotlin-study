package chapter02

inline class StudentId(val studentId: Int)

fun main(args: Array<String>) {
    val studentId = StudentId(31)
    println("studentId = $studentId")
}

