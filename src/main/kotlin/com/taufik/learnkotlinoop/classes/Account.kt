package com.taufik.learnkotlinoop.classes

import kotlin.properties.Delegates

// This class using lazy properties.
// Lazy is a standard library which has been provided, so that new properties will be initialize when it accessed.
class Account(description: String = "") {

    // This properties return String type, so it must initialize String as return value
    val name: String by lazy {
        println("Name is called")
        "Taufik"
    }

    // One of standard library that provided by Kotlin for delegation in properties is observable properties.
    // By using observable properties, we knew value before and value after when changed.
    var description: String by Delegates.observable(description) {
        property, oldValue, newValue ->
            println("${property.name} changed from $oldValue to $newValue")
    }
}