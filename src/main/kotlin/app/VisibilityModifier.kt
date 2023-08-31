package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Eko")
    val character = 'A'
//    teacher.teach()
    println(teacher.name)
    teacher.test()
}