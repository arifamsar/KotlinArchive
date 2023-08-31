package app
fun main() {
    fun getFullAddress(streetName: String = "Jl. Malioboro", number: Int = 50): String {
        return "I live in $streetName No. $number"
        getFullAddress(streetName = "Jl. Margonda")
    }
}