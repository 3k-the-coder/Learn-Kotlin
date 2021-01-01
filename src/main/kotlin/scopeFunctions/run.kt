package scopeFunctions

fun main() {
    /*
        return: "Lambda result"
        reference: "this"
     */

    // can be called as the combination of let function and with function

    // If you want to use nullable object and avoid nullPointerException then use 'run'

    val person: Person? = Person()
    val bio = person?.run {
        println("In run")
        "He is a coding freak by the name k3coder"
    }

    println(bio)
}