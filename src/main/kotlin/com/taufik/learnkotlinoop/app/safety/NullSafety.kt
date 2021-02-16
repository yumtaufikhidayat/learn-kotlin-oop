package com.taufik.learnkotlinoop.app.safety

import com.taufik.learnkotlinoop.classes.*

fun main() {

    sayHello(Friend("Taufik"))
    sayHello(null)

    sayHelloSafeCall(Friend("Hidayat"))
    sayHelloSafeCall(null)

    sayHelloElvis(Friend("Taufik Hidayat"))
    sayHelloElvis(null)

    sayHelloAssert(Friend("Taufik TH"))
    sayHelloAssert(null)
}