package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Minus
import com.taufik.learnkotlinoop.classes.Modulo
import com.taufik.learnkotlinoop.classes.Operation
import com.taufik.learnkotlinoop.classes.Plus

// Sealed class used for when expression.
fun operation(value1: Int, value2: Int, operation: Operation) : Int{
    return when (operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {

    // Call the subclass in sealed class.
    // Plus and Minus is subclass that inherit from sealed class.
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))
}