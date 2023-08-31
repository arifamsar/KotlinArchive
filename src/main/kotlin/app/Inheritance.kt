package app

import data.Asdos
import data.Manager
import data.VicePresident


fun main() {
    val manager = Manager("Arif")
    manager.katakanHalo("Budi")

    val vicePresident = VicePresident("Arif")
    vicePresident.katakanHalo("Joko")

    val asdos = Asdos("Joko")
    asdos.sayHello("Amsar")
}