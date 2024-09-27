package org.example.exercise_2

class Employee(name: String, age: Int, email: String, val salary: Int) : Person(name, age, email) {
    override fun displayInfo () {
        println("Name: ${this.name}, age: ${this.age}, email: ${this.email}, salary: $$salary")
    }
}