package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Arif")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Arif", 10000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)

}