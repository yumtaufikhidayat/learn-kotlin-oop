package com.taufik.learnkotlinoop.app.checkcasts

import com.taufik.learnkotlinoop.classes.HandPhone
import com.taufik.learnkotlinoop.classes.Laptop

fun main() {

    // By using any type, we can print all input type
    printObjectIf("Taufik") // String
    printObjectIf(1) // Integer
    printObjectWhen(Laptop("Acer")) // Class with parameter
    printObjectWhen(HandPhone("Samsung S21 Ultra")) // Class with parameter
    printString("Taufik")
//    printString(1) // It will failed to cast because 1 is not String type
    printStringSafe(1) // It will return null as value
}

// This function will receive all any parameters type using when expression,
// Such as: data type or class with parameter
fun printObjectWhen(any: Any) {

    // Kotlin using smart case, so it will convert data type that checked to another data type automatically.
    // The "any" will be converted into object of class type.
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("HandPhone with name ${any.name}")
        else -> println(any)
    }
}

// This function will receive all any parameters type using if expression,
// Such as: data type or class with parameter
fun printObjectIf(any: Any) {

    // Kotlin using smart case, so it will convert data type that checked to another data type automatically.
    // The "any" will be converted into object of class type.
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("HandPhone with name ${any.name}")
    } else {
        println(any)
    }
}

// We can cast to another type using as.
// It will force to certain data type.
// But this cast is unsafe cast and not recommended to go.
// If data type is not as same as we want, it will throw ClassCastException.
fun printString(any: Any) {
    val value = any as String
    println(value)
}

// But we can cast with as keyword safely, called nullable cast.
// We just add as?.
// But if Kotlin failed to convert, the return will be null.
fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}