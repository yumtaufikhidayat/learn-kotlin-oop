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

    // Function with same name called function overloading.
    // Function overloading is a function that has same name with other function,
    // But the parameter, a number of parameter, or data type is different
    // Ex: This function below has same name with sayHello() function above
    fun sayHello(firstNameParam: String, lastNameParam: String) {
        println("Hello $firstNameParam $lastNameParam, my name is $firstName")
    }
}