package com.taufik.learnkotlinoop.interfaces

// Interface is like a blueprint of class. Initialize any properties are not allowed.
// But there is an exception that we can initialize properties body of function. It is called concrete function.
// If we use interface, the class which inherit or use interface must be implement all members (properties or function) inside it.
// By default, all properties inside interface is abstract, we don't need to add abstract keyword.
interface Interaction {

    val name: String

    fun sayHello(name: String)
}

// Interface can extend both from any interfaces or from multiple interfaces.
// If an interface extend multiple interfaces, just add "," comma to separate.
// But interface can't extend from class.
interface Go : Interaction {

    // Interface with concrete function
    fun go(){
        println("Go!")
    }
}

// Conflict interface caused by we don't override function in each interface.
// We must override the function at class which used the interface.
// Ex: These two interfaces are using same function name, so the class which used them must override the function.
interface MoveA {
    fun move() = println("Move A!")
}

interface MoveB {
    fun move() = println("Move B!")
}
