package com.taufik.learnkotlinoop.classes

// This is outer class
class Boss(val bossName: String) {

    // This is inner class
    // By default, the inner class cannot access properties or function of outer class and so is outer class.
    // To make the inner class access members (properties or function) of outer class, just add "inner" keyword.
    inner class Employee(val name: String){

        fun hi() {
            println("Hi, my name is $name and my boss name is ${this@Boss.bossName}")
        }
    }

}