package com.taufik.learnkotlinoop.classes

// This class has primary constructor.
// But the primary constructor are called properties in constructor.
// Properties in constructor will make our codes ease to maintain and more dynamic.
// We can make properties in constructor only in primary constructor and are not allowed in secondary constructor.
// Properties in constructor make our code more concise.
class User(
    var usernameParam: String,
    var passwordParam: String
) {

    // We will override toString function to change the return value.
    override fun toString(): String {
        return "User with username = $usernameParam"
    }

}