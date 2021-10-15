package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.Student

// Kotlin has various standard library which contains some functions
// which can be used to execute object easily which make use of lambda expression.
// These functions are: let, run, with, apply, and also.
fun main() {

    letFunction()

    runFunction()

    applyFunction()

    alsoFunction()

    withFunction()
}

// let function is used as reference block so that we can manipulate object easily.
// let function has its parameter object, so we can use "it" keyword to get reference of its object.
fun letFunction() {

    println("Fungsi let dijalankan")

    val student = Student("Taufik", 22)
    val result = student.let {
        "Name is ${it.name} and age is ${it.age}"
    }

    println("$result \n")
}

// Run function has similarity with let function.
// By using run function, no parameter in lambda, so we can't access object reference by using "it" keyword.
// But we can use "this" keyword.
fun runFunction() {

    println("Fungsi run dijalankan")

    val student = Student("Hidayat", 23)
    val result = student.run {
        "Name is ${this.name} and age is ${this.age}"
    }

    println("$result \n")
}

// Apply function has similarity with run function.
// By using apply function, return value from apply function is its object reference.
fun applyFunction() {

    println("Fungsi apply dijalankan")

    val student = Student("Taufik Hidayat", 24)
    val result = student.apply {
        "Name is ${this.name} and age is ${this.age}"
    }

    println("$result \n")
}

// Also function has similarity with let function.
// By using also function, return value is a reference to its object.
fun alsoFunction() {

    println("Fungsi also dijalankan")

    val student = Student("Hidayat Taufik", 25)
    val result = student.also {
        "Name is ${it.name} and age is ${it.age}"
    }

    println("$result \n")

}

// With function has similarity with run function.
// But with function is not extension function, so it can't be used from the object directly.
// We call with function manually.
fun withFunction() {

    println("Fungsi also dijalankan")

    val student = Student("Taufik Hidayat", 26)
    val result = with(student) {
        "Name is ${this.name} and age is ${this.age}"
    }

    println("$result \n")
}