package fundamentals

fun main() {
    val r1 = 1..5 // r1  = 1,2,3,4,5
    val r2 = 5 downTo 1 // r2 = 5, 4, 3, 2, 1
    val r3 = 5 downTo 1 step 2 // r3 = 5, 3, 1
    val r4 = "a".."z" // r4 = "a" "b" .... "z"

    // use in operator to check whether a value exists in the collection of variables
    print("Xi" in r4)
}