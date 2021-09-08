package com.taufik.learnkotlinoop.classes

// This class is parent class and will inherit to child class(es).
// By default, the class is final and cannot inherit to child class(es).
// To make inherit, we must add "open" keyword before class.
open class Employee(val name: String) {

    // By default, this function is final and cannot override to child class
    // If we want to override to child class, we must add "open" before fun
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// These classes are inherited from parent class (Employee) and called child class.
// All properties and function will be inherited from parent class.
// If we want to extend from parent class, just add : mark.
open class Manager(name: String) : Employee(name){

    // This function is override from function in parent class
    // It means, we rewrite the function with the same name as function in parent class
    // Just add override before fun

    // Also, this function is final override.
    // It means we cannot override this function to another child class,
    // If we make this class as parent class.
    // We can add final before override
    // By default, override function is open.
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {

//    override fun sayHello(name: String) {
//        println("Hello $name, my name is Super Manager ${this.name}")
//    }
}

class VicePresident (name: String) : Employee(name){

    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}
