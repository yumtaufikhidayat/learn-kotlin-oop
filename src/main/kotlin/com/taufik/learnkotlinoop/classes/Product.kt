package com.taufik.learnkotlinoop.classes

// This called data class.
// Kotlin will generate toString, equals, and hashCode automatically without having make it explicitly.
data class Product(val name: String, val price: Int, val category: String)