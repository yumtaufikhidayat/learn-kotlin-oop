package com.taufik.learnkotlinoop.app.keyword.superkeyword

import com.taufik.learnkotlinoop.classes.Rectangle

fun main() {

    val rectangle = Rectangle()
    println("Length ${rectangle.length}")
    println("Parent length ${rectangle.parentLength}")

    rectangle.printName()
}