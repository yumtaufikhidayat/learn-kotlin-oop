package com.taufik.learnkotlinoop.app.`object`

import com.taufik.learnkotlinoop.`object`.Application
import com.taufik.learnkotlinoop.`object`.Utilities

fun main() {

    // Be careful if we use singleton object with mutable value.
    // Because it will change all value of data.
    Utilities.name = "Diubah"
    println(Utilities.toUpper("Eko"))

    funA()
    funB()

    // Accessing inner object.
    println(Application.Utilities.toUpper("Taufik"))
}

fun funA() {
    println(Utilities.name)
}

fun funB() {
    println(Utilities.name)
}