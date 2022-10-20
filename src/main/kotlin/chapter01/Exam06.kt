package chapter01

fun main(args: Array<String>) {

    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    list1.add(1)
    list2 = list2 + 1

    println("list1 = $list1")
    println("list2 = $list2")
}

data class MutableUser(val name: String)

class UserHolder {

    private val user = MutableUser("jean")

    fun get(name: String): MutableUser {
        return user.copy(name)
    }
}

class UserRepository {

    private val storedUser: MutableMap<Int, String> =
            mutableMapOf()

    // 읽기 전용 슈퍼타입으로 업캐스팅하여 가변성을 제한합니다.
    fun loadAll(): Map<Int, String> {
        return storedUser
    }
}
