package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Boss

fun main() {

    // Because of employee class is in boss class,
    // We must make the outer class' object, then we can make object for inner class
    // by accessing the outer class' object to manipulate.
    val boss1 = Boss("Joko") // This is object for outer class.
    val employee1 = boss1.Employee("Taufik") // The object of inner class can access the members of outer class.
    val employee2 = boss1.Employee("Budi") // The object of inner class can access the members of outer class.
    employee1.hi()
    employee2.hi()

    val boss2 = Boss("Rudi") // This is object for outer class.
    val employee3 = boss2.Employee("Eko") // The object of inner class can access the members of outer class.
    val employee4 = boss2.Employee("Yuda") // The object of inner class can access the members of outer class.
    employee3.hi()
    employee4.hi()

}