package app

import data.Person

fun main() {
    val arif = Person()
    arif.firstName = "Muhammad"
    arif.middleName = "Arif"
    arif.lastName = "Amsar"

    arif.sayHello("Budi")
    arif.run()

    val fullName = arif.getFullName()
    println(fullName)
}