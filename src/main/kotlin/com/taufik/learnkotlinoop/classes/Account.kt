package com.taufik.learnkotlinoop.classes

// This class using lazy properties.
// Lazy is a standard library which has been provided, so that new properties will be initialize when it accessed.
class Account {

    // This properties return String type, so it must initialize String as return value
    val name: String by lazy {
        println("Name is called")
        "Taufik"
    }
}