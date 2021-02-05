package com.taufik.learnkotlinoop.app.classes

import com.taufik.learnkotlinoop.classes.Gender

fun main() {

    // To make enum class object
    val man = Gender.MALE
    val woman = Gender.FEMALE

    // To get all data of enum
    val allGenders: Array<Gender> = Gender.values()

    // Convert from String to enum object
    // Name of string must be same with members inside enum class
    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGenders.toList())

    man.printDescription()
    woman.printDescription()

}