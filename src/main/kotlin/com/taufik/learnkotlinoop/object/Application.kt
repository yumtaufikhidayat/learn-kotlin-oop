package com.taufik.learnkotlinoop.`object`

// This is inner object.
// Inner object is different with inner class, singleton object can't accessed properties or function in outer class.
class Application(val name: String) {

    object Utilities {
        var name = "Utilities"

        fun toUpper(value: String): String {
            return value.toUpperCase()
        }
    }
}