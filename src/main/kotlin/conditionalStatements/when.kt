package conditionalStatements

// in kotlin when acts as an alternative to switch statement,
// there is no need to write break after each case
// and no need of case keyword as well
// else works similar to default in Java

// in order to match for multiple expressions use expressions separated by a comma
// can make use range as well as given below

// similar to if, when can also be used as an expression

fun main() {
    val x = 7
    when(x) {
        1 -> print("value is 1")
        2 -> print("value is 2")
        3, 4 -> print("value is either 3 or 4")
        in 5..9 -> print("Value is in the range of 5 to 9")

        else -> print("value is 3")

    }
}