package chapter01

fun main(args: Array<String>) {

}


sealed class Result<out T>
class Success<out T> (val result: T): Result<T> ()
class Failure(val throwable: Throwable): Result<Nothing>()
class JsonParsingException: Exception()

/*
inline fun <reified T> String.readObject(): Result<T> {
    val inCorrectSing = true

    if (inCorrectSing) {
        return Failure(JsonParsingException())
    }

    return Success(result)
}*/
