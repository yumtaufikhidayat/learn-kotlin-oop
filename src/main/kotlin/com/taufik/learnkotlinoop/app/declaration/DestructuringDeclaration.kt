package com.taufik.learnkotlinoop.app.declaration

import com.taufik.learnkotlinoop.classes.Game
import com.taufik.learnkotlinoop.classes.Login
import com.taufik.learnkotlinoop.classes.minMax

fun main() {

//    val games = Games("Game Kotlin", 1_000)
//    val name = games.name
//    val price = games.price
//    println("$name $price")

    val game = Game("Mario Bros", 500_000, 20)
    val (names, prices, age) = game
    println(names)
    println(prices)
    println(age)

    val (min, max) = minMax(100, 200)
    println(min)
    println(max)

    // Use underscore for unused variable
    val (mins, _) = minMax(10, 200)
    println(mins)
//    println(max)

    // Destructuring lambda parameter
    val login = Login("taufik", "rahasia")
    println(login(login) { (uname, pass) ->
        uname == "taufik" && pass == "rahasia"
    })
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}