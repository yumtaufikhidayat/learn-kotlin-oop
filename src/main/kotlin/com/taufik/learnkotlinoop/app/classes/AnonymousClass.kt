package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Action

fun main() {

    // To access anonymous class, we can add "object" keyword.
    // We don't need to make class to access anonymous class.
    fireAction(object : Action{
        override fun action() {
            println("Action one")
        }

        override fun doSomething() {
            println("Do something 1")
        }
    })

    fireAction(object : Action{
        override fun action() = println("Action two")
        override fun doSomething() {
            println("Do something 2")
        }
    })
}

// Action is anonymous class as interface type.
fun fireAction(action: Action) {
    action.action()
    action.doSomething()
}