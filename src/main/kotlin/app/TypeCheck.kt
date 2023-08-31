package app

import data.HandPhone
import data.Laptop
import data.SmartPhone

fun printObject(any: Any) {
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone) {
        println("Handphone with name ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is HandPhone -> println("Handphone with name ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String
    println(value)

}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printString("Amsar")
    // printString(1) // error
    printStringSafe("Amsar")
    printStringSafe(2) // null
    printObject("Arif")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Xiaomi"))

    printObjectWhen("Arif")
    printObjectWhen(1)
    printObjectWhen(Laptop("Acer"))
    printObjectWhen(HandPhone("Xiaomi"))
}