package classes

// companion objects are defined inside the class,
// it converts the properties and the methods declared inside the companion objects, static methods of the class


class MyCompanionClass {
    companion object {
        var count: Int = 1
        fun typeOfCustomer(): String {
            return "Indian"
        }
    }
}

fun main() {
    println(MyCompanionClass.count)
    println(MyCompanionClass.typeOfCustomer())
}