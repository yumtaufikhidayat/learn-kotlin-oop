package com.taufik.learnkotlinoop.classes

// Enum class is representation of class which the value(s) is fixed/absolute.
// Usually, enum class is used for raw data types, like: gender, wind direction, lengths, weights, etc.
// Enum class can have the properties and function.
// But if it has the constructors, the enum object must be filled.
// And if it has abstract function, must be overridden when creating enum object.
// To use enum class, just add "enum" keyword before class.
enum class Gender(private val description: String, private val age: Int) {
    MALE("Male", 20),
    FEMALE("Female", 18);

    fun printDescription() {
        println(description)
        println(age)
    }
}