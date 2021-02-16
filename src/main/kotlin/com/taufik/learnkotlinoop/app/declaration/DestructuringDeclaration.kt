package com.taufik.learnkotlinoop.app.declaration

import com.taufik.learnkotlinoop.classes.Game

fun main() {

//    val games = Games("Game Kotlin", 1_000)
//    val name = games.name
//    val price = games.price
//    println("$name $price")

    val game = Game("Mario Bros", 500_000)
    val (names, prices) = game
    println(names)
    println(prices)
}