package com.taufik.learnkotlinoop.`object`

// Singleton object is object which is create for once.
// To make singleton object in Kotlin as same as we make class.
// Singleton object is similar with class, it can extends or interface. But it doesn't have constructor.
// To use it, just add object keyword.
object Utilities {
    var name = "Utilities"

    fun toUpper(value: String): String {
        return value.toUpperCase()
    }
}