package advancedConcepts

/*
?. --> safe call operator
?: --> Elvis operator
!! --> Not null assertion
?.let{..}  --> Safe call with let

 */

fun main() {
    val name:String? = "Kunal"

    // 1) ?. safe call operator
        // returns the length if the name is not null otherwise returns null
    println("The length of the string is ${name?.length}")

    // 2) Safe call with let ?.let
        // executes the block only if name is not null
    name?.let{ println("The length of the string is ${name.length}")}

    // 3) ?: Elvis operator
        // if null can assign other values
    val length = name?.length ?: 1
    println("The length of the name is $length")

    // 4) !! Non null assertion operator
        // Use it when you are sure that the value is not NULL
    print("The length of the name is ${name!!.length}") // throws null pointer execption if the variable has null value
}