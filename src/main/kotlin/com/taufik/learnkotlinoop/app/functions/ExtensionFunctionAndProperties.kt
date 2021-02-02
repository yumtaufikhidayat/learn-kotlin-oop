package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Student
import com.taufik.learnkotlinoop.classes.sayHello
import com.taufik.learnkotlinoop.classes.upperName

fun main() {

    val student = Student("Eko", 12)
    student.sayHello("Taufik") // We can access extension function by using object
    println(student.upperName) // We can access extension properties by using object
}