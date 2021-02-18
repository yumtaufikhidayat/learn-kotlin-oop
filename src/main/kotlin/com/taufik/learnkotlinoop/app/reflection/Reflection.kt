package com.taufik.learnkotlinoop.app.reflection

import com.taufik.learnkotlinoop.annotations.NotBlank
import com.taufik.learnkotlinoop.classes.CreateCategoryRequest
import com.taufik.learnkotlinoop.classes.CreateProductRequest
import com.taufik.learnkotlinoop.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun main() {

    val request = CreateProductRequest("1", "Indomie", 5_000L)
    validateRequest(request)

    val request2 = CreateCategoryRequest("F", "Food")
    validateRequest(request2)
}

fun validateRequest(request: Any) {

    val clazz = request::class
    val properties = clazz.memberProperties

    // iterate one by one, then check @NotBlank annotation is exist
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            when (val value = property.call(request)) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}