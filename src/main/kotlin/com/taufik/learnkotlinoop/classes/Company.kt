package com.taufik.learnkotlinoop.classes

class Company(val name: String) {

    // We can override function of equals to change the value
    // The object will convert / call the equals function automatically.
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> other.name == this.name
            else -> false
        }
    }
}