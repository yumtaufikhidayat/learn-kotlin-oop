package com.taufik.learnkotlinoop.classes

// There are four visibility modifiers in Kotlin. Public, private, protected, and internal.
// The Class, properties, interface, function, etc. in Kotlin is public by default. So we can access it from anywhere.
// If we use private, we can access the class, properties, interface, function, etc. inside the certain place only.
// If we use protected, we can access the class, properties, interface, function, etc. inside the certain place and the inherits only.
// If we use internal, we can access all inside the project only. Not allowed to access outside the project.
open class Teacher(val name: String) {

    // This function is public. We don't need to add public keyword explicitly.
    fun teach() {
        println("Teach!")
    }

    // This function is private. We can access it inside the file containing declaration.
    private fun teachPrivate() {
        println("Teach!")
    }

    // This function is protected. We can access it either from this class or from subclass.
    protected open fun test() {
        println("Test!")
    }
}

// This class inherit from superclass that override function with protected visibility modifiers.
class SuperTeacher(name: String) : Teacher(name) {

    override fun test() {
        super.test()
    }
}