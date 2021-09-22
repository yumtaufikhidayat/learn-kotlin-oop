package com.taufik.learnkotlinoop.classes

class Television {

    // By default, we must initialize properties. Either the value from constructor/parameter or we input by our self.
    // If we don't initialize at first, Kotlin automatically will give an error.
    // But we can initialize properties later by using lateinit keyword.
    // The "lateinit" keyword only used for var, mutable data. While we use val, it will give an error.
    lateinit var brand: String

    // We initialize properties in somewhere, ex: in this function.
    fun initTelevision(brand: String) {
        this.brand = brand
    }
}