package functions

// allows you to use recursion in the most optimised way compared to other languages.

// kotlin internally handles the code in such a way that stack overflow exception doesn't occur.

tailrec fun fact(num: Int): Int {
    if(num == 1) return 1
    return num * fact(num -1)
}

fun main() {
    print(fact(90))
}