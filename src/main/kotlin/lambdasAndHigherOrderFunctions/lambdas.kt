package lambdasAndHigherOrderFunctions



// lambdas are functions with no name

// lambdas are defined inside curly braces, syntax is as follows,
// {variableName -> body}

// lambdas and HOFs are used extensively in android development.

interface  myPrintInterface {
    fun execute(sum: Int)
}

class Program {
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) { // higher order function taking fn as parameter
        val sum  = a + b
        action(sum)
    }

    // if you have lambda fn as the last parameter, you can write it separately from the method declaration
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {
        val result = action(a, b)
        println(result)
    }

    fun addTwoNumbers(a: Int, b:Int, action: myPrintInterface) {
        val sum = a + b;
        action.execute(sum)
    }
}

fun main() {
    var program = Program()
    program.addTwoNumbers(2, 7, object : myPrintInterface {
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val myLambda: (Int) -> Unit = { s -> println(s) } // -------------------- lambda expression ---------------------
    program.addTwoNumbers(8, 7, myLambda)

    // new form of calling HOFs
    program.addTwoNumbers(3, 9) {x, y -> x + y}

}

