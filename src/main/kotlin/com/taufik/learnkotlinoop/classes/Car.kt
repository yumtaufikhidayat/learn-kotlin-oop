package com.taufik.learnkotlinoop.classes

// This class is using constructor. Constructor is located in bracket () as parameter.
// Also this class using initializer block to execute some codes inside class.
// By default, we can't add some codes here except constructor and attribute(s) to execute
// Or our code will be error.
// This class is using secondary constructor.
// If we add secondary constructor, we must assign it into primary constructor
class Car (
    // This called primary constructor
    brandParam: String,
    nameParam: String,
    yearParam: Int
) {

    // This code will be execute after Kotlin executes the constructor
    // Never add program too many because will make the code's burden is heavy
    init {
        println("Car $brandParam dibuat pada tahun $yearParam")
    }

    // This called secondary constructor. It must assign to primary constructor with : and this
    constructor(brandParam: String, nameParam: String) : this(brandParam, nameParam, 2021) {
        // We can add program inside secondary constructor's body
        println("Secondary constructor 1")
    }

    // This called secondary constructor. It has assigned to secondary constructor above
    constructor(brandParam: String) : this(brandParam, "") {
        println("Secondary constructor 2")
    }

    // Objects initialize
    var brand: String = brandParam
    var name: String = nameParam
    var year: Int = yearParam
}