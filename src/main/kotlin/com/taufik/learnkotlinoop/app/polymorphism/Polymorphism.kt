package com.taufik.learnkotlinoop.app.polymorphism

import com.taufik.learnkotlinoop.classes.Employee
import com.taufik.learnkotlinoop.classes.Manager
import com.taufik.learnkotlinoop.classes.SuperManager
import com.taufik.learnkotlinoop.classes.VicePresident

// Polymorphism is an ability of object to change from a form to another form.
// Polymorphism is closely related with inheritance.
fun main() {

    var employee = Employee("Taufik")
    employee.sayHello("Budi")

    employee = Manager("Hidayat")
    employee.sayHello("Budi")

    employee = SuperManager("Taufik Hidayat")
    employee.sayHello("Budi")

    employee = VicePresident("Hidayat Taufik")
    employee.sayHello("Budi")
}