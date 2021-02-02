package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Student
import com.taufik.learnkotlinoop.classes.sayHello

fun main() {

    val student = Student("Eko", 12)
    student.sayHello("Taufik") // We can access extension function by using object
}