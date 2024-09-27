package org.example.exercise_2

open class Person(val name: String,val age: Int, val email: String,) {
    open fun displayInfo (){
        println("Name: ${this.name}, age: ${this.age}, email: ${this.email}")
    }
}