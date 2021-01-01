package scopeFunctions

fun main() {
    /*
        returns : "Lambda result"
        refers: "it"

     */

    // has many applications but most important use case is to avoid null pointer exceptions

    val name: String?  = "Kunal"
    name?.let {
        println("name ${it.reversed()}")
        println("Capitalize ${it.capitalize()}")
    }
}