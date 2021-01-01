package appsOfCollectionsAndLambdas

fun main() {
    val myNumbers = listOf(2, 3, 4, 5, 6, 36, 91, 67)

    print("all -> ")
    val checkOne = myNumbers.all { it > 10 } // returns true if all the elements pass the condition
    println(checkOne)

    print("any -> ")
    val checkTwo = myNumbers.any{ it > 10 } // returns true if any one of the elements pass the condition
    println(checkTwo)

    print("Count -> ")
    val totalCount = myNumbers.count{ it > 10 } // returns the number of elements that satisfy the condition
    println(totalCount)

    print("find -> ") // find returns nullable integer, that means the return value can also be null
    val findElement = myNumbers.find { it > 10 } // returns the first number that mathces the condition
    println(findElement)


    // check so many other predicates




}