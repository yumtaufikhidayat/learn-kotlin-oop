package com.taufik.learnkotlinoop.classes

// Abstract class cannot be an object. It made only for inheritance.
// By default, it is open class. So we don't need to declare it explicitly.
// Abstract class is suitable to make parent class to inherit data to child class.
abstract class Location(val name: String)
class City(name: String) : Location(name)
class Country(name: String) : Location(name)