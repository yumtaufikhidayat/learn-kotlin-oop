package com.taufik.learnkotlinoop.app

import com.taufik.learnkotlinoop.classes.Person

fun main() {

    //We can make many of objects from one class. It is not limited.
    //Also we can manipulate data of class by access its properties
    val taufik = Person()
    taufik.firstName = "Taufik"
    taufik.lastName = "Hidayat"

    println(taufik.firstName)
    println(taufik.lastName)

}