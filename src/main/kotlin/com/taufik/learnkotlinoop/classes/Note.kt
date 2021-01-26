package com.taufik.learnkotlinoop.classes

class Note(title: String) {

    // By default, Kotlin will make getter and setter function automatically when we initialize properties.
    var title : String = title

        // Keyword "field" means to title
        get() {
            println("Call getter function")
            return field
        }

        // Keyword "value" means to data
        set(value) {
            println("Call setter function")
            if (value.isNotBlank()) {
                field = value
            } else {
                println("Invalid title")
            }
        }
}

class BigNotes(val title: String){

    val bigTitle: String

    get() = title.toUpperCase()
}