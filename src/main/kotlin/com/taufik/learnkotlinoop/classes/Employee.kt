package com.taufik.learnkotlinoop.classes

// This class is parent class and will inherit to child class(es).
// By default, the class is final and cannot inherit to child class(es).
// To make inherit, we must add "open" keyword before class.
open class Employee(val name: String) {

    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// These classes are inherit from parent class (Employee) and called child class.
// All properties and function will be inherit from parent class.
// If we want extend from parent class, just add : mark.
class Manager(name: String) : Employee(name)
class VicePresident (name: String) : Employee(name)
