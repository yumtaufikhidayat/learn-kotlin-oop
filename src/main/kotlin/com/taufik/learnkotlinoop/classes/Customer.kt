package com.taufik.learnkotlinoop.classes

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "Standard")
}

// Super constructor can only access via constructor.
// It means, super constructor in child class can only access to parent's constructor.
// If we don't add primary constructor in child class,
// We can access parent's parameter via secondary constructor.
class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium")
    constructor(name: String, balance: Long) : super(name, "Premium", balance)
}

// But if we add primary constructor in child class,
// The parent class that inherits must be assigned to parent's primary constructor.
// We don't need to add super in secondary constructor, just use this to access primary constructor
class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "", balance) {
    constructor(name: String) : this(name, 0)
}