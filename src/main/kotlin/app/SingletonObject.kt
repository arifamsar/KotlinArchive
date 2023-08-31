package app

import data.Application
import data.Utilities

fun main() {
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("arif"))
    a()
    b()

    println(Application.Utilities.toUpper(("arif")))
}

fun a(){
    println(Utilities.name)
}

fun b() {
    println(Utilities.name)
}