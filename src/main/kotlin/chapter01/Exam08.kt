package chapter01

fun main(args: Array<String>) {

 /*   var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()

    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }

    print(primes)*/

    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1  }
        print(numbers)

        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }

    print(primes.take(10).toList())
    `안녕하세요`();

    val isTest = true
    require(isTest)
}

fun `안녕하세요`() {
    println("안녕")
}






