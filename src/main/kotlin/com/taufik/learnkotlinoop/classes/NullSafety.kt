package com.taufik.learnkotlinoop.classes

// In Java, we knew NullPointerException (NPE) error.
// This error appears because we want to access properties or function with null object.
// In Kotlin, it is happened rarely, because it is not recommended to use nullable type.
// Although we use nullable type, we can tell to Kotlin to use ? (question mark) character explicitly.
data class Friend(val name: String)

// Explicitly checking for null
fun sayHello(friend: Friend?) {
    if (friend != null) {
        println("Hello ${friend.name}")
    }
}

// Using safe call (?)
fun sayHelloSafeCall(friend: Friend?) {
    println("Hello ${friend?.name}")
}

// Using elvis operator
fun sayHelloElvis(friend: Friend?) {
    val name = friend?.name ?: "Friend"
    println("Hello $name")
}

// Using assert (!!) makes possible to get NPE
fun sayHelloAssert(friend: Friend?) {
    val name = friend!!.name
    println("Hello $name")
}