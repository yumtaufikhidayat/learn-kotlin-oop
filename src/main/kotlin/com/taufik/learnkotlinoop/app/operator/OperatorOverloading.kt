package com.taufik.learnkotlinoop.app.operator

import com.taufik.learnkotlinoop.classes.Fruit

fun main() {

    val fruit1 = Fruit(20)
    val fruit2 = Fruit(20)
    val fruit3 = fruit1 + fruit2
    println(fruit3)
    println(fruit3 - Fruit(10))
}