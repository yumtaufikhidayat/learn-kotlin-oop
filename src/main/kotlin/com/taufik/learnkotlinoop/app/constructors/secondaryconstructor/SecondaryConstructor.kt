package com.taufik.learnkotlinoop.app.constructors.secondaryconstructor

import com.taufik.learnkotlinoop.classes.Address

fun main() {

    // If we want access the attributes of class by using constructor,
    // We have to insert data into the bracket of class
    val address1 = Address("Jalan A", "DKI Jakarta")
    val address2 = Address("Jalan A", "DKI Jakarta", "Indonesia")

    println(address1.street)
    println(address1.city)

    println(address2.street)
    println(address2.city)
    println(address2.country)
}