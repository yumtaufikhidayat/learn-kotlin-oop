package com.taufik.learnkotlinoop.app.exception

import com.taufik.learnkotlinoop.exception.ValidationException
import java.lang.NullPointerException

fun main() {

    // Using try catch exception, multiple catch, and finally
    // Try catch exception means program will run first, but if any errors, program will throw to catch block automatically.
    // Multiple catch means we want to know which error specifically appeared.
    // Finally, means either program will run smoothly or not, it will always be executed.
    try {
        validateAndSayHello("Taufik")
        validateAndSayHello("")
        validateAndSayHelloNull(null)
    } catch (error: ValidationException) {
        println("Error with message ${error.message}")
    } catch (error: NullPointerException) {
        println("Error NPE ${error.message}")
    } finally {
        println("Finally will always be executed")
    }
}

fun validateAndSayHello(name: String) {

    // Making exception
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun validateAndSayHelloNull(name: String?) {
    if (name != null) {
        if (name.isBlank()) {
            throw ValidationException("Name is blank")
        } else {
            println("Hello $name")
        }
    } else {
        throw NullPointerException("Name is null")
    }
}