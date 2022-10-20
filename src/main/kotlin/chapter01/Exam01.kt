package chapter01

import java.lang.Exception

class BankAccout {

    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawAmount: Double) {
        if (balance < withdrawAmount) {
            throw InsufficientFunds()
        }

        balance -= withdrawAmount
    }
}

class InsufficientFunds : Exception()


fun main(args: Array<String>) {
    val account = BankAccout()
    println(account.balance) // 0.0

    account.deposit(100.0)
    println(account.balance)

    account.withdraw(150.0)
    println(account.balance)
}
