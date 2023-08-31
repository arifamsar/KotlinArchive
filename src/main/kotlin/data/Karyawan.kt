package data

open class Karyawan(val name: String) {
    open fun katakanHalo(name: String) {
        println("Hello $name, Nama saya ${this.name}")
    }
}

open class Manager(name: String) : Karyawan(name) {
    final override fun katakanHalo(name: String) {
        println("Hello $name, Nama saya Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
//    override fun katakanHalo(name: String) {
//        println("Hello $name, Nama saya Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Karyawan(name) {
    override fun katakanHalo(name: String) {
        println("Hello $name, Nama saya Vice President ${this.name}")
    }
}