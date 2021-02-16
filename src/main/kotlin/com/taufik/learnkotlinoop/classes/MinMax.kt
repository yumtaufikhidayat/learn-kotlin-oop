package com.taufik.learnkotlinoop.classes

data class MinMax(val min: Int, val max: Int)

// Destructuring declaration in function
fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}