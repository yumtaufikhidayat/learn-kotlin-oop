package com.taufik.learnkotlinoop.classes

import com.taufik.learnkotlinoop.interfaces.Go
import com.taufik.learnkotlinoop.interfaces.MoveA
import com.taufik.learnkotlinoop.interfaces.MoveB

// Child class can inherit multiple parent interface or inherit more than one interface.
// To use it, just separate using "," comma.
// Note: If we extend interface, we still allowed extend from parent class (super class).
class Human(override val name: String) : Go, MoveA, MoveB {

    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun move() {
        // We can use super keyword to define which function in interface that has same name will be used.
        super<MoveA>.move() // It will assign to move in MoveA interface
        super<MoveB>.move() // It will assign to move in MoveB interface
        println("Move human!")
    }
}