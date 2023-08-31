package app

import data.Television

fun main() {
    val tv = Television()
    tv.initTelevision("Polytron")
    tv.brand = "Polytron"
    println(tv.brand)
}
