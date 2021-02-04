package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Action

fun main() {

    // To access anonymous class, we can add "object" keyword.
    // We don't need to make class to access anonymous class.
    fireAction(object : Action{
        override fun action() {
            println("Action one")
        }
    })

    fireAction(object : Action{
        override fun action() = println("Action two")
    })

}

// Action is anonymous class as interface type.
fun fireAction(action: Action) {
    action.action()
}