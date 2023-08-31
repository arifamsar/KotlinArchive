package app

import data.Rectangle
import data.Shape
import data.Tringale

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Tringale()
    println(shape3.corner)
}