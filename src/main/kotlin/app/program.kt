package app

import annotations.Fancy


@Fancy(author = "Arif")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Applicaton $name-$version"
}