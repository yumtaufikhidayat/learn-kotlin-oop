package com.taufik.learnkotlinoop.classes

open class Shape {

    // These properties and function will inherit to child class, called properties overriding.
    // Just add open before val or val, so we can override properties to child class.
    open val length = 1
    open val width = 1
    open val height = 3
    open val base = 2

    open fun printName() {
        println("This is shape")
    }
}

class Rectangle : Shape() {

    // Just add "override" before val or val.
    override val length = 2
    override val width = 3
    val parentLength = super.length // This will access of parent's properties

    override fun printName() {
        println("This is rectangle")
        super.printName() // It means we will print out this parent's function too
    }
}

class Triangle : Shape() {

    // Just add "override" before val or val.
    override val height = 2
    override val base = 3
}