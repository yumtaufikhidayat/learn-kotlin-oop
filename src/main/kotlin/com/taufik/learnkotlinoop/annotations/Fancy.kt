package com.taufik.learnkotlinoop.annotations

// Annotation is adding a metadata/additional information to program which we created.
// Not all everyone needs annotation, it used to add library/framework and can access with reflection.
// To make annotation, just add "annotation" keyword before creating class.
// Annotation only allowed has a properties via primary constructor and not allowed to have other members in body.

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)