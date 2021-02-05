package com.taufik.learnkotlinoop.classes

// Enum class is representation of class which the value(s) is fixed/absolute.
// Usually, enum class is used for raw data types, like: gender, wind direction, lengths, weights, etc.
// Enum class can have the properties and function.
// But if it has the constructors, the enum object must be filled.
// And if it has abstract function, must be override when creating enum object.
// To use enum class, just add "enum" keyword before class.
enum class Gender(val description: String) {
    MALE("Male"),
    FEMALE("Female");

    fun printDescription() {
        println(description)
    }
}