package com.taufik.learnkotlinoop.classes


// By default, these class extend Any class automatically.
// We don't need to write it explicitly.
// If we extend to parent class, the parent class extends Any class automatically.
class Laptop(val name: String)

open class HandPhone(val name: String)

class SmartPhone(name: String, val os: String) : HandPhone(name)