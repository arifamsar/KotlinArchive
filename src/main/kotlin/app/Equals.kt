package app

import data.Company

fun main() {
    val company1 = Company("Arif")
    val company2 = Company("Arif")
    val company3 = Company("Amsar")

    println(company1 == company2)
    println(company1 == company1)
    println(company3 == company1)
}