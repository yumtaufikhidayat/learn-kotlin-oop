package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Company

fun main() {

    val company1 = Company("Taufik")
    val company2 = Company("Taufik")

    // It will give return false, neither we have override equals function nor we haven't
    // Because they have different memory address
    // To change value to true, we have to override the hashCode function
    println(company1.hashCode() == company2.hashCode())

    // Both of object has same memory address now, so it will return to true value
    println(company1.hashCode())
    println(company2.hashCode())

}