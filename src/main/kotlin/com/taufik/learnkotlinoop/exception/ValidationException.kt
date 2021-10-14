package com.taufik.learnkotlinoop.exception

// When we created programs, we will face error
// There are so many error, either it is presumed like validation error or not presumed like network error,
// connect to database error, and many more.
// Error in Kotlin is represented by Exception, which all error data types will inherit from Throwable class.
// To make error in Kotlin is so easy, we can use "throw" keyword followed by its error object.
class ValidationException(message: String) : Throwable(message)