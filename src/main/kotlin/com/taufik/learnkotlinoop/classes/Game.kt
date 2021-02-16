package com.taufik.learnkotlinoop.classes

// Destructuring declaration is creating multiple variables from an object.
// Destructuring declaration can't be applied to all objects,
// It is only work to object that has function componentX() that can be destructured.
// When we created data class, it will create function componentX() automatically depends on a number of parameters.

// Destructuring declaration manually
//class Games(val name: String, val price: Int){
//    operator fun component1(): String = name
//    operator fun component2(): Int = price
//}

// Destructuring declaration automatically
data class Game(val game: String, val price: Int)

