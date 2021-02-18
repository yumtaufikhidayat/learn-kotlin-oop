package com.taufik.learnkotlinoop.classes

import com.taufik.learnkotlinoop.annotations.NotBlank

// Reflection is an ability to see our application structure when runs.
// It is usually used when we create library or framework, so it can automate our work.
// To access reflection class from an object, we can use "::class" keyword or directly from ClassName::class.

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String
)