package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.User

fun main() {
    val user = User("Taufik", "rahasia")

    // We can print to string explicitly by adding .toString (optional).
    // It will convert / call the .toString function automatically.
    println(user)
}