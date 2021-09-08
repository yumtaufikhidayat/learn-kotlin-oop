package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Manager
import com.taufik.learnkotlinoop.classes.VicePresident

fun main() {

    // Class Manager has all properties and function which extend from Employee class.
    // We can access all parent class' behavior
    val manager = Manager("Taufik")
    manager.name
    manager.sayHello("Hidayat")

    // Class VicePresident has all properties and function which extend from Employee class.
    // We can access all parent class' behavior
    val vicePresident = VicePresident("Hidayat")
    vicePresident.name
    vicePresident.sayHello("Taufik")
}