package com.taufik.learnkotlinoop.classes

// This class is using constructor. Constructor is located in bracket () as parameter.
// Also this class using initializer block to execute some codes inside class.
// By default, we can't add some codes here except constructor and attribute(s) to execute
// Or our code will be error.
class Car(
    brandParam: String,
    yearParam: Int = 2021
) {

    //This code will be execute after Kotlin executes the constructor
    init {
        println("Car $brandParam dibuat pada tahun $yearParam")
    }

    // Objects initialize
    var brand: String = brandParam
    var year: Int = yearParam
}