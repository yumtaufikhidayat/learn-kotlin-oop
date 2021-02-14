package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Token

fun main() {

    val token = Token("ini token")
    println(token.value)
    println(token.toUpper())
}