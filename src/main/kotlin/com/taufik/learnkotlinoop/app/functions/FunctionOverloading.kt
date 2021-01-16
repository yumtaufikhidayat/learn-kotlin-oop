package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Person

fun main() {

    val taufik = Person()
    taufik.firstName = "Taufik"

    // Access function(s) inside class by adding . (dot) mark after object name
    taufik.sayHello("Budi")
    taufik.sayHello("Budi", "Doremi")
}