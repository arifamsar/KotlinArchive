package app

import data.Boss

fun main() {
    val boss1 = Boss("Arif")
    val employee1 = boss1.Employee("Safiq")
    val employee2 = boss1.Employee("Durun")

    val boss2 = Boss("Budi")
    val employee3 = boss2.Employee("Rudi")
    val employee4 = boss2.Employee("Joko")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}