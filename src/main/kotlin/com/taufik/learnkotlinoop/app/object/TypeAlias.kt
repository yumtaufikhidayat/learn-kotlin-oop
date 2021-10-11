package com.taufik.learnkotlinoop.app.`object`

import com.taufik.learnkotlinoop.`object`.Application

// Type alias is making a different name from any of data types.
// We usually use it when any of same name data type.
// Or to shorten data type, so we don't need to write it too long.
// To use type alias, just write "typealias" keyword.

typealias App = Application
typealias Aplikasi = App // this type alias is from above
typealias App2 = com.taufik.learnkotlinoop.object2.Application

typealias StringSupplier = () -> String // typealias as function

fun main() {

    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    val app2 = App2("Kotlin App")

    sayHello { "Taufik" }
}

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}