package collections

fun main() {
    // Map: key -> value
    // mutableMapOf returns LinkedHashMap

    val myMap = mapOf<String, String>("name" to "Kunal", "age" to "22") // Immutable, fixed size, read only

    // iterating over the map
    for(key in myMap.keys)
        print("${myMap[key]} ") // can use myMap.get(key)
    println()


    // to use mutable map, make use of HashMap, hashMapOf, mutableMapOf
    val myMutableMap = mutableMapOf<Int, Int>(1 to 2, 2 to 4, 4 to 8)
    myMutableMap.replace(4, 16)
    for(key in myMutableMap.keys)
        print("$key --> ${myMutableMap.get(key)} ")
    println()
}