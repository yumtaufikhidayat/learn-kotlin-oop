package com.taufik.learnkotlinoop.classes

open class Shape {

    // This properties will inherit to child class, called properties overriding.
    // Just add open before val or val, so we can override properties to child class.
    open val length = 1
    open val width = 1
    open val height = 3
    open val base = 2
}

class Rectangle : Shape() {

    // Just add "override" before val or val.
    override val length = 2
    override val width = 3
}

class Triangle : Shape() {

    // Just add "override" before val or val.
    override val height = 2
    override val base = 3
}