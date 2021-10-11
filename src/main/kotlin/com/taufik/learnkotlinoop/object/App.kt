package com.taufik.learnkotlinoop.`object`

// Companion object is an ability of making inner object inside class, without using object name.
// Companion object will automatically use "Companion" name, or it can be accessed by class name.
class App {
    companion object {
        fun hello(name: String) {
            println("Hello $name")
        }
    }
}