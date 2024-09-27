package org.example.exercise_1

fun main() {
    println("Write number to check if positive:");
    val inputNumberString = readln();
    if(inputNumberString.toDoubleOrNull() == null){
        println("You should type only number!")
    } else{
        val inputNumber = inputNumberString.toDouble();
        if(inputNumber > 0){
            println("Number($inputNumber) is positive");
        } else if(inputNumber < 0){
            println("Number($inputNumber) is negative");
        } else {
            println("Number($inputNumber) is zero");
        }
    }
}