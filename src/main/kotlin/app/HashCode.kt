package app

import data.Company

fun main() {
    val company1 = Company("Arif")
    val company2 = Company("Arif")
    val company3 = Company("Amsar")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}