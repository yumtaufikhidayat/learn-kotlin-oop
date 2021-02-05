package com.taufik.learnkotlinoop.app.`object`

import com.taufik.learnkotlinoop.`object`.App

fun main() {

    // Accessing companion object
    println(App.hello("Taufik"))
    println(App.Companion.hello("Taufik")) // We don't need to add Companion explicitly
}