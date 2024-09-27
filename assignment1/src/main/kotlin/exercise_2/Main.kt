package org.example.exercise_2

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val person = Person(
        name = "John",
        age = 17,
        email = "john@gmail.com",)
    val employee = Employee(
        person.name,
        person.age,
        person.email,
        salary = 400
    )

    val bankAccount = BankAccount(
        balance = 500
    )


    person.displayInfo()

    employee.displayInfo()

    bankAccount.deposit(400)
    bankAccount.withdraw(1000)
    bankAccount.withdraw(400)
}