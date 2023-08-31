package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student = Student("Amsar", 18)
    println(student.name)
    student.sayHello("Budi")
    student?.upperName
    println(student?.upperName)
}