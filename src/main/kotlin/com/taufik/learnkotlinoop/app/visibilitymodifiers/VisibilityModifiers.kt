package com.taufik.learnkotlinoop.app.visibilitymodifiers

import com.taufik.learnkotlinoop.classes.SuperTeacher

fun main() {

    val teacher = SuperTeacher("Taufik")
    println(teacher.name)
    teacher.teach()
//    teacher.teachPrivate() // Error. It is private modifier.
//    teacher.test() // Error. It is protected modifier.
}