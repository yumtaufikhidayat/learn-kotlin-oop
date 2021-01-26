package com.taufik.learnkotlinoop.app.abstracts

import com.taufik.learnkotlinoop.classes.Cat
import com.taufik.learnkotlinoop.classes.Dog

fun main() {

    val cat = Cat()
    val dog = Dog()

    println(cat.name)
    cat.run()

    println(dog.name)
    dog.run()
}