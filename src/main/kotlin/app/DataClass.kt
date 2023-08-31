package app

import data.Product

fun main() {
    val product = Product("Indomie", 3500, "Food")
    println(product)

    val product2 = product.copy(name = "Mie Sedap")
    println(product2)
}