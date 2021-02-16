package com.taufik.learnkotlinoop.app.declaration

import com.taufik.learnkotlinoop.classes.Game
import com.taufik.learnkotlinoop.classes.Login
import com.taufik.learnkotlinoop.classes.minMax

fun main() {

//    val games = Games("Game Kotlin", 1_000)
//    val name = games.name
//    val price = games.price
//    println("$name $price")

    val game = Game("Mario Bros", 500_000)
    val (names, prices) = game
    println(names)
    println(prices)

    val (min, max) = minMax(100, 200)
    println(min)
    println(max)

    // Use underscore for unused variable
    val (mins, _) = minMax(10, 200)
    println(mins)
//    println(max)

    // Destructuring lambda parameter
    val login = Login("taufik", "rahasia")
    login(login){(username, password) ->
        username == "taufik" && password == "rahasia"
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}