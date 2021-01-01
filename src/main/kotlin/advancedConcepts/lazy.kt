package advancedConcepts

val pi = 3.14f // if we don't use it in the program then it is a waste of memory.
                // to overcome such situations of wastage of memories we make use of lazy

val lazyPi: Float by lazy { // this means unless you use it in your program the value won't be initialized
    3.14f
}

fun main() {
    println()

    println("The lazy pi will be initialized now ${lazyPi * lazyPi}")

    println("The lazy pi will be loaded from cache now ${lazyPi}")
}