package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Product

fun main() {

    val product = Product("Indomie", 2000, "Food")
    println(product)

    // We can make copy of data class both to duplicate and manipulate its properties.
    val product2 = product.copy()
    println(product2)

    val product3 = product.copy(name = "Supermie")
    println(product3)
}