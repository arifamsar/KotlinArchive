package data

open class Mahasiswa(val name: String) {
    fun sayHello(name: String) {
        println("Hello $name, nama saya ${this.name}")
    }
}

class Asdos(name: String) : Mahasiswa(name)

