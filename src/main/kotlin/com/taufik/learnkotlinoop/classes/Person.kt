package com.taufik.learnkotlinoop.classes

class Person {

    //Objects initialize
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    // Functions inside class
    // Also this function using "this" keyword to refer the properties
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.firstName}")
    }

    fun run() {
        println("I'm running")
    }

    // This function using "this" keyword to refer the properties
    fun getFullName(): String {
        return "${this.firstName} ${this.middleName} ${this.lastName}"
    }

    // Function with same name called function overloading.
    // Function overloading is a function that has same name with other function,
    // But the parameter, a number of parameter, or data type is different
    // Ex: This function below has same name with sayHello() function above
    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }
}