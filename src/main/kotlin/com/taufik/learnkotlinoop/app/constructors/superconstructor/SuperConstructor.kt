package com.taufik.learnkotlinoop.app.constructors.superconstructor

import com.taufik.learnkotlinoop.classes.ExecutiveCustomer
import com.taufik.learnkotlinoop.classes.PremiumCustomer

fun main() {

    val premiumCustomer = PremiumCustomer("Taufik")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Taufik", 1_000_000_000L)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}