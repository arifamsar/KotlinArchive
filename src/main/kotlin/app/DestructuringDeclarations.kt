package app

import data.Game
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int):MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(Login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(Login)
}

fun main() {
    val game = Game("Assasin Creed", 500000)
//    val name = game.name
//    val price = game.price
    val(name,price) = game
    println("Nama game : $name, harganya : Rp.$price")

//    val result = minmax(10,100)
//    val min = result.min
//    val max = result.max
    val(min, max) = MinMax(10,100)
//    println("Max = $max Min = $min")
    println(min)
    println(max)

    val login = Login("Amsar", "Rahasia")
//    login(Login) {
//        login.username == "Amsar" && login.Password == "Rahasia"
//    }
    login(login) { (username, password) ->
        username == "Amsar" && password == "Rahasia"
    }

    println(login)
}