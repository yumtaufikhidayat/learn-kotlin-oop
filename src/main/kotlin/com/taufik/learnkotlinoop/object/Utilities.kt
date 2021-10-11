package com.taufik.learnkotlinoop.`object`

// Singleton object is object which is created for once.
// To make singleton object in Kotlin as same as we make class.
// Singleton object is similar with class, it can extend or interface. But it doesn't have constructor.
// To use it, just add object keyword.
object Utilities {
    var name = "Utilities"

    fun toUpper(value: String): String {
        return value.toUpperCase()
    }
}