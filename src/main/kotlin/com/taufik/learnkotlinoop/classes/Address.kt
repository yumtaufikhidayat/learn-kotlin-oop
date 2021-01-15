package com.taufik.learnkotlinoop.classes

// This class doesn't use primary constructor, but this class uses secondary constructor
class Address {

    //Objects initialize
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

    // This secondary constructor doesn't assign primary constructor,
    // Which is the primary constructor doesn't exist
    constructor(streetParam: String, cityParam: String){

        // Assign attribute(s) to param(s)
        street = streetParam
        city = cityParam
    }

    // We can assign this secondary constructor to another secondary constructor (optional)
    constructor(streetParam: String, cityParam: String, countryParam: String) :
            this(streetParam, cityParam) {

        // Because we have assigned to another secondary constructor,
        // We just assign another attribute(s) to another param(s)
        country = countryParam
    }
}