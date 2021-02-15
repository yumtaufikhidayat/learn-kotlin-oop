package com.taufik.learnkotlinoop.app.delegation

import com.taufik.learnkotlinoop.classes.Delegates
import com.taufik.learnkotlinoop.classes.DelegatesOverride
import com.taufik.learnkotlinoop.classes.MyBase
import com.taufik.learnkotlinoop.classes.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Taufik")

    // We use base object above to delegate task for baseDelegate object.
    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Taufik H")
    baseDelegate.sayGoodBye("Hidayat")

    val delegates = Delegates(base)
    delegates.sayHello("Taufik")
    delegates.sayGoodBye("Hidayat")

    val delegatesOverride = DelegatesOverride(base)
    delegatesOverride.sayHello("Taufik")
    delegatesOverride.sayGoodBye("Hidayat")
}