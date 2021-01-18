package com.taufik.learnkotlinoop.app.properties

import com.taufik.learnkotlinoop.classes.Rectangle
import com.taufik.learnkotlinoop.classes.Shape
import com.taufik.learnkotlinoop.classes.Triangle

fun main() {

    // Just call properties by using object
    val shape = Shape()
    println(shape.length)
    println(shape.width)
    println(shape.height)
    println(shape.base)

    val rectangle = Rectangle()
    println(rectangle.length)
    println(rectangle.width)

    val triangle = Triangle()
    println(triangle.height)
    println(triangle.base)
}