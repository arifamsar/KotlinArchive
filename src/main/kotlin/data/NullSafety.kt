package data

data class Friend(val name: String)

fun sayHello (friend: Friend?) {
//    if (friend != null) {
//    println("Hello ${friend.name}")
//    }
//    println("Hello ${friend?.name}")
//    val name = friend?.name ?: ""
//    println("Hello $name")

    val name = friend!!.name
    println("Hello $name")

}
fun main() {
    sayHello(Friend("Arif"))
    sayHello(null) //error
}