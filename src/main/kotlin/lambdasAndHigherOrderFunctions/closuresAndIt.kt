package lambdasAndHigherOrderFunctions

// In java 8 you can't mutate values of outside variables inside lambdas.
// But in kotlin you can change the values

fun addNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {
    action(a, b)
}

fun main() {
    var result = 0
    // changing the value inside lambda function
    addNumbers(1, 5) {a, b -> result = a + b}

    println(result)

    // it demo
    // a function should have a single parameter, and it is named as "it" implicitly by the compiler
    val name: String = "Kunal"
    reverseString(name) { it.reversed() }

}

// it is the name of single parameter inside the lambdas
fun reverseString(str: String, myFunc: (String) -> String) {
    val reverse = myFunc(str)
    println(reverse)
}