package app

import data.City
import data.Country
import data.Location

fun main() {
    // val location = Location("Pekanbaru")
    val city = City("Pekanbaru")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}