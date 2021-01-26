package com.taufik.learnkotlinoop.classes

abstract class Animal {

    // If we make abstract class, the properties / function must be in abstract too.
    // We don't need to initialize the properties or function.
    // Initializing will be done in child class.
    abstract val name: String
    abstract fun run()
}

// The child class must be override properties or function from abstract class.
class Cat : Animal() {

    override val name: String = "Cat"
    override fun run() {
        println("$name run!")
    }
}

class Dog : Animal() {

    override val name: String = "Dog"
    override fun run() {
        println("$name run!")
    }
}