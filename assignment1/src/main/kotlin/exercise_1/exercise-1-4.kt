package org.example.exercise_1

fun main() {
    val numbers = listOf(1,3,6)
    for (number in numbers){
        println(number)
    }
    println("Sum: ${numbers.sum()}")
}