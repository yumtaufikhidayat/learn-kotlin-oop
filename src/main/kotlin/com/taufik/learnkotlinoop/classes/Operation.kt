package com.taufik.learnkotlinoop.classes

// Sealed class is designed for inheritance.
// By default, it is abstract class and can't be initialize as object.
// Sealed class is suitable as parent class.
// And we can add abstract function or abstract properties inside it.
sealed class Operation(val name: String)

class Plus : Operation("Add")

class Minus : Operation("Minus")

class Modulo : Operation("Modulo")