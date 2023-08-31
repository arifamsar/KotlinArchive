package app

import data.Person

fun main() {
    val arif = Person()
    arif.firstName = "Arif"

    arif.sayHello("Budi")
    arif.sayHello("Budi", "Nugroho")
}