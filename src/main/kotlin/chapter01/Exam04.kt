package chapter01

fun main(args: Array<String>) {

    val name = Name2()

    if (name.fullName != null) {
        // println(name.fullName.length) - custom g게터로 정의했기 때문에 스마트 캐스트가 불가능..값을 사용하는 시점의 name에 따라서 다른결과가 나올 수 있음.
    }

    if (name != null) {
        println(name.fullName2?.length)
    }

    val list = listOf(1, 2, 3)
    val mutableList = list.toMutableList()
    mutableList.add(4)

    mutableList.forEach { println("$it") }

}

class Name2 {

    val name: String? = "Marcin"
    val surname: String? = "Bruno"

    val fullName: String?
        get() = name?.let { "$it $surname" }

    val fullName2: String? = name?.let { "$it $surname" }
}



