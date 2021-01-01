package collections

// set contains list of unique elements
// HashSet also contains unique elements, but sequence is not guaranteed in output

fun main() {
    var mySet = setOf<Int>(1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 6) // returns the immutable read only set
    for(element in mySet)
        print("$element ")
    println()

    // mutable set can be created using mutableSetOf, order will be maintained
    val myMutableSet = mutableSetOf<Int>(1, 1, 1, 2, 2, 3, 4)
    myMutableSet.add(20)
    for(element in myMutableSet)
        print("$element ")
    println()

    // hashSet doesn't guarantee the order  



}