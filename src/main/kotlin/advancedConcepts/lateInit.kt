package advancedConcepts

// in kotling you can either initialize a variable or you can declare an abstract variable
// in order to declare a variable which would be initialized later make use of "late init" keyword

fun main() {
    lateinit var name: String
    // if the variable is not initialized before its first use, an exception will be thrown

    name = "India"
    println(name)
}

/*
------- Properties of lateinit
1. can only be used with mutable values, i.e. var keyword
2. can only be used with non-nullable data type
3. must be initialized before they are used.
 */
