package org.example.exercise_3

// Basic function
fun sum(a:Int, b: Int): Int{
    return a + b;
}

// Multiply lambda function
val multiply: (Int, Int) -> Int = { x, y -> x * y }

// Pass lambda to function
fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}