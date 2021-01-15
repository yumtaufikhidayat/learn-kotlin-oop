package com.taufik.learnkotlinoop.classes

class Person {

    //Objects initialize
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    // Functions inside class
    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }

    fun run() {
        println("I'm running")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}