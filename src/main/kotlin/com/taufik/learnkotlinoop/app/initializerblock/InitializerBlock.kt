package com.taufik.learnkotlinoop.app.initializerblock

import com.taufik.learnkotlinoop.classes.Car

fun main() {
    // If we want access the attributes of class by using constructor,
    // we have to insert data into the bracket of class
    val avanza = Car("Toyota")
    val mobilio = Car("Honda", "Mobilio")
    val xenia = Car("Daihatsu")

    // Access attributes of class can be used to print result
    println(avanza.brand)
    println(mobilio.year)
    println(xenia.brand + " " + avanza.year)
}