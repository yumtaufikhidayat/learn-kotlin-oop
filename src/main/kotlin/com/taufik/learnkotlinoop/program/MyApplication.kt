package com.taufik.learnkotlinoop.program

import com.taufik.learnkotlinoop.annotations.Fancy

// Call our annotation here.
@Fancy(author = "Taufik")
class MyApplication(val name: String, val version: Int) {

    @Fancy(author = "Wafiq")
    fun info(): String = "Application $name Versi $version"
}