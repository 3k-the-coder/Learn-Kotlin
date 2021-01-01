package collections

fun main() {
    // list immutable in nature, fixed size, read only
    val myImmutableList = listOf<String>("Kunal", "Karan", "Anuradha", "Panduranga")

    // mutable List make use of ArrayList, arrayListOf, mutableListOf
    // mutableList mutable in nature, no fixed size, can add or remove elements
    val myMutableList = mutableListOf<String>()
    myMutableList.add("Kunal")
    myMutableList.add("Karan")

    myMutableList.removeAt(1)
    myMutableList.add("Dhoni")

    // both of these lines can be run by single line
    myMutableList[1] = "Kohli"
}