package app

import data.Address

fun main() {
    val address1 = Address("Jl. A", "Batam")
    val address2 = Address("Jl. B", "Pekanbaru", "Indonesia")

    println(address1.street)
    println(address2.street)
}