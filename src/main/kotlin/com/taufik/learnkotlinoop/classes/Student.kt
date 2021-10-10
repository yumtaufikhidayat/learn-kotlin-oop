package com.taufik.learnkotlinoop.classes

class Student(val name: String, val age: Int)

// This called extension function.
// We don't make any function in class.
// If we make properties parameter in private or protected, we can't access from outside.
// By default, extension function is not nullable.
// We can make extension function nullable by adding ? (question mark).
fun Student?.sayHello(name: String) {
    if (this!=null){
        println("Hello $name, my name is ${this.name} and my age is ${this.age}")
    }
}

// This called extension properties.
// To make extension properties, we can make properties by using getter and/or setter.
val Student.upperName: String
    get() = this.name.toUpperCase()