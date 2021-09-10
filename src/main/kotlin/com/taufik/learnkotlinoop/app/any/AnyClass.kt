package com.taufik.learnkotlinoop.app.any

import com.taufik.learnkotlinoop.classes.SmartPhone

fun main() {

    val smartPhone = SmartPhone("Samsung S21", "Android")
    val phone = SmartPhone("", "Android")

    // Accessing some methods of Any class
    println(smartPhone.toString())
    println(smartPhone.hashCode())
    println(smartPhone.equals(""))

    println(phone.equals(""))
}