package com.taufik.learnkotlinoop.classes

// Delegation is one of most famous design pattern.
// In simply, delegation is forwarding properties or function to another object.
// Kotlin supports delegation without making codes manually.
// In delegation, properties and function will be delegated to chosen object automatically.
// But we can override properties and function which we want.
interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodBye(name: String) {
        println("Good bye $name")
    }
}

// Delegate manually.
// Function inside class doesn't do anything.
// It just receives input and delegates class' function into interfaces' function.
class MyBaseDelegate(private val base: Base) : Base{
    override fun sayHello(name: String) {
        base.sayHello(name)
    }

    override fun sayGoodBye(name: String) {
        base.sayGoodBye(name)
    }
}

// Delegate automatically.
// By using delegate automatically, we don't need to override function one by one manually.
class Delegates(private val base: Base) : Base by base

// Delegate automatically.
// We can override which function or properties we want to.
class DelegatesOverride(private val base: Base) : Base by base {
    override fun sayHello(name: String) {
        println("Hi $name")
    }
}