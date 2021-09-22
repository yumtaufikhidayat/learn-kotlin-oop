package com.taufik.learnkotlinoop.app.properties

import com.taufik.learnkotlinoop.classes.Television

fun main() {

    val television = Television()
//    println(television.brand) // Error. Because we don't initialize properties at first

    // We can initialize properties either from function or properties in main function or somewhere.
    television.initTelevision("Samsung")
    println(television.brand) // Success. We have initialize properties at function.

    television.brand = "GoldStar"
    println(television.brand) // Success. We have initialize properties at main function.
}