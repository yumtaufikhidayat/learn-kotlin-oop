package com.taufik.learnkotlinoop.app.any

import com.taufik.learnkotlinoop.classes.SmartPhone

fun main() {

    val smartPhone = SmartPhone("Samsung S21", "Android")

    // Accessing some methods of Any class
    println(smartPhone.toString())
    println(smartPhone.equals(""))
    println(smartPhone.hashCode())

}