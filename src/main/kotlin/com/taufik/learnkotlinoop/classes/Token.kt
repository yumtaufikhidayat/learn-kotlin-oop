package com.taufik.learnkotlinoop.classes

// Sometimes, we need to make a class with one property.
// Too many classes need more memory to run.
// Kotlin has solved this issue by using inline class.
// Inline class is a class that must have exactly one primary constructor parameter.
// Just add "inline" keyword before class name.
inline class Token(val value: String) {
    fun toUpper(): String = value.toUpperCase()
}