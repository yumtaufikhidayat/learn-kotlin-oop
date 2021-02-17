package com.taufik.learnkotlinoop.proram

import com.taufik.learnkotlinoop.annotations.Fancy

// Call our annotation here.
@Fancy(author = "Taufik")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name Versi $version"
}