package app

import data.User

fun main() {
    val user1 = User("arif", "rahasia")
    val user2 = User("amsar", "rahasia2")

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}