package com.example.bankaccountprogram

class BankAccount(var acoountHolder: String, var balance: Double) {
   private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double) {
    balance += amount
    transactionHistory.add("$acoountHolder deposited $$amount")
    }
    fun withDraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$acoountHolder withdrew $$amount")
        }
        else {
            println("You don't have funds to withdraw $$amount")
        }

    }
    fun displayTransactionHistory() {
        println("Transaction history for $acoountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

}

fun main() {
    val denisBankAcoount = BankAccount("Danis",1338.20)
    denisBankAcoount.deposit(200.0)
    denisBankAcoount.withDraw(1200.0)
    denisBankAcoount.deposit(3000.0)
    denisBankAcoount.deposit(2000.0)
    denisBankAcoount.withDraw(3333.15)
    denisBankAcoount.displayTransactionHistory()
    println("${denisBankAcoount.acoountHolder}'s balance is: ${denisBankAcoount.balance}")
}