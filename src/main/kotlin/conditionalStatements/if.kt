package conditionalStatements

fun main() {
    val a = 2
    val b = 5

    // In kotlin if can be used as an expression i.e. a value can be returned from if or anyother subsequent
    // blocks

    // say if block has multiple lines of code then last statement will be returned

    val maxVal = if (a > b) a else b
    print(maxVal)
}