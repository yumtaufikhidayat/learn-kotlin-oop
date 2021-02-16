package com.taufik.learnkotlinoop.classes

// Kotlin supports operator overloading, which we can make functions from any of operators like math operators and etc.
// This ability makes us do any operations like Integer type.
// To make operator overloading, just add "operator" keyword before we declare the function.
data class Fruit(val quantity: Int){
    operator fun plus(fruit: Fruit): Fruit{
        return Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: Fruit): Fruit{
        return Fruit(this.quantity - fruit.quantity)
    }
}
