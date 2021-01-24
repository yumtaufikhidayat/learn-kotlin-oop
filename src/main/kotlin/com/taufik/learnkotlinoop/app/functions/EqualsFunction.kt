package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Company

fun main() {

    val company1 = Company("Taufik")
    val company2 = Company("Taufik")

    // By default, it will return to false, because of comparing two different objects.
    // Either the value is same or not.
    // But, we have changed the equals function value to return true value,
    // So the return value will be true.
    println(company1 == company2)

    // By default, it will return to true, because of comparing two of the same object
    println(company1 == company1)
    println(company2 == company2)

}