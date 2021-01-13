package com.taufik.learnkotlinoop.classes

// This class is using constructor. Constructor is located in bracket () as parameter.
class Car(
    brandParam: String,
    yearParam: Int = 2021
) {

    // Objects initialize
    var brand: String = brandParam
    var year: Int = yearParam
}