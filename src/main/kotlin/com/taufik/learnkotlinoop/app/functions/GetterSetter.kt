package com.taufik.learnkotlinoop.app.functions

import com.taufik.learnkotlinoop.classes.BigNotes
import com.taufik.learnkotlinoop.classes.Note

fun main() {

    val note = Note("Belajar Kotlin OOP")

    // To print out the result, we just call the properties.
    // Kotlin will call getter function to get data / value.
    // Also, Kotlin will call setter function to change data / value.
    println(note.title)

    note.title = "Belajar OOP"
    note.title = ""
    println(note.title)

    val bigNotes = BigNotes("Belajar Kotlin OOP")
    println(bigNotes.title)
    println(bigNotes.bigTitle)
}