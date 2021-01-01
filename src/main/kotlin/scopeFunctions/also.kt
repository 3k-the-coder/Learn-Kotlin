package scopeFunctions

fun main() {
    /*
        returns: "Context object"
        refers: "it"
     */
    // is used when you want to perform additional operation on an object after we have initialized it.

    val numbersList: MutableList<Int> = mutableListOf(1, 2, 3)

    numbersList.also{
        println("The numbers are $it")
        it.add(10)
        println("The numbers are $it")
    }

    println("FInal numbers are $numbersList")
}