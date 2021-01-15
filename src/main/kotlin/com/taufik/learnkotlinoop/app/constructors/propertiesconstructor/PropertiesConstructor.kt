package com.taufik.learnkotlinoop.app.constructors.propertiesconstructor

import com.taufik.learnkotlinoop.classes.User

fun main() {

    // If we want access data in class which has properties in constructor,
    // We just access it as we access properties using object
    val user1 = User("taufik", "katasandi")
    val user2 = User("hidayat", "sandikata")

    // We can change data of params if we use var instead of val
    user1.usernameParam = "hidayat"
    user1.passwordParam = "rahasia"

    user2.usernameParam = "taufik"
    user2.passwordParam = "rahasiasangat"

    println(user1.usernameParam)
    println(user1.passwordParam)

    println(user2.usernameParam)
    println(user2.passwordParam)

}