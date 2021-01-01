package appsOfCollectionsAndLambdas

// filter is used to filter out elements from the collection
// map is used to perform operations, modify elements

fun main() {
    val myNumbers: List<Int> = listOf(2, 3, 17, 38, 7, 90)

    val mySmallNumbers = myNumbers.filter { it < 10 }

    for(num in mySmallNumbers)
        print("$num ")
    println()

    // map returns the list containing the results of applying given transform function
    // to each element in the given collection
    val mySquaredNumbers: List<Int> = myNumbers.map { it * it }

    for(num in mySquaredNumbers)
        print("$num ")
    println()

    println("Filter and map together")
    val myNewNumbers = myNumbers.filter { it < 10 }
                                .map { it * it }
                                .filter { it < 10 }
    for(num in myNewNumbers)
        print("$num ")
    println()
}