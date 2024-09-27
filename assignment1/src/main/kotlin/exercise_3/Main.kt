package exercise_3

import org.example.exercise_3.applyOperation
import org.example.exercise_3.multiply
import org.example.exercise_3.sum

fun main() {
    // Test sum function
    val resultSum = sum(5, 3)
    println("Sum: $resultSum")

    // Test multiply lambda function
    val resultMultiply = multiply(4, 2)
    println("Multiply: $resultMultiply")

    // Test applyOperation function with sum
    val resultApplySum = applyOperation(7, 3, ::sum)
    println("Apply Operation (Sum): $resultApplySum")

    // Test applyOperation function with multiply
    val resultApplyMultiply = applyOperation(6, 4, multiply)
    println("Apply Operation (Multiply): $resultApplyMultiply")
}
