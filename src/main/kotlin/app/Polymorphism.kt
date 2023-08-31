package app

import data.Karyawan
import data.Manager
import data.VicePresident

fun main() {
    var employee: Karyawan = Karyawan("Arif")
    employee.katakanHalo("Budi")

    employee = Manager("Arif")
    employee.katakanHalo("Budi")

    employee = VicePresident("Arif")
    employee.katakanHalo("Budi")

}