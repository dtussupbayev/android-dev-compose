package org.example.exercise_2

class BankAccount(var balance: Int) {

    fun deposit(amount: Int){
        balance+=amount
        println("deposit($amount): ${displayInfo()}")
    }

    fun withdraw(amount: Int){
        if(balance - amount >= 0){
            balance-=amount
            println("withdraw($amount): ${displayInfo()}")
        }else{
            println("withdraw($amount): BankAccount hasn't enough balance for withdraw")
        }
    }

    private fun displayInfo(): String{
        return "Balance: $balance"
    }
}