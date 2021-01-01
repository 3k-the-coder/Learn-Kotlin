package scopeFunctions

fun main() {
    /*
        refers to context object by "this"
        returns: "context object"
     */

     val person = Person().apply {
         name = "Karan"
         age = 25
     }.also {
         it.name = "Kunal"
         println("${it.name} ${it.age}")
     }

}