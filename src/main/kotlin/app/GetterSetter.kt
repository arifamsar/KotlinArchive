package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = "Aku suka Kotlin"
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}