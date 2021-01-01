package functions

// infix functions will have keyword infix to begin with
// and will have one and only one parameter

// allows you to call a function with differnt syntax which is helpful in operator overloading

infix fun Int.addTen(num:Int): Int = num + 10

fun main() {
    println(10 addTen 20)
}