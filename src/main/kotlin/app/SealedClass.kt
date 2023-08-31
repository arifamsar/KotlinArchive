package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int , operation: Operation): Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {
    println(operation(10, 20, Plus()))
    println(operation(30, 20, Minus()))
    println(operation(30, 4, Modulo()))
}