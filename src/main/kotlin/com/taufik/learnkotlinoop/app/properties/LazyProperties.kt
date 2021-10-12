package com.taufik.learnkotlinoop.app.properties

import com.taufik.learnkotlinoop.classes.Account

fun main() {

    // Lazy properties called once, even we print properties many times.
    val account = Account()
    println(account.name)
    println(account.name)
    println(account.name)
    println(account.description)
}