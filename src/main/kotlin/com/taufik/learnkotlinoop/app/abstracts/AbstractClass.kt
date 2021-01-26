package com.taufik.learnkotlinoop.app.abstracts

import com.taufik.learnkotlinoop.classes.City
import com.taufik.learnkotlinoop.classes.Country


fun main() {

//    val location = Location("Jakarta") // Error because it is abstract class
    val city = City("Jakarta")
    val country = Country("Indonesia")

    println("Kota ${city.name}")
    println("Negara ${country.name}")
}