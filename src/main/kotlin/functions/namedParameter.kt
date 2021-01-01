package functions

// is a pure kotlin feature and is not available in Java

// can provide name of the arguments while providing value or say while calling the functions

fun namedParameterExample(a: Int, b: Int, c: Int): Unit {
    print("$a $b $c")
}

fun main() {
    namedParameterExample(a = 10, c= 3,b= 5)
}