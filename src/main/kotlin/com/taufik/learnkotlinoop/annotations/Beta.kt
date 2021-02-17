package com.taufik.learnkotlinoop.annotations

// Kotlin annotation runs well with Java annotation.
// Sometimes we want to place annotation depends on what we want so that it can be read in Java properly.
// Usually it happens if we use Kotlin but use Java framework, so that annotation target must be appropriate
// with its framework which usually used in Java.
// In Kotlin, we can use @target:AnnotationName to determine which annotation location target will be placed.
@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)