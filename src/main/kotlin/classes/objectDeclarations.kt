package classes

// singleton classes are those which will have only one instance and whose instance is created by kotlin internally
// In java we create singleton using static keyword

// in kotlin we can create objects, when the compiler sees this object it will create a singleton internally

// objects can have initializers internally

object Customer {
    var id: Int = 1
    var name: String = "Kunal"
    fun typeOfCustomer(): String {
        return "Indian"
    }
}

fun main() {
    // objects are accessed using their name similar static classes in Java
    Customer.id = 10
    println("${Customer.id} ---- ${Customer.name} ---- ${Customer.typeOfCustomer()}")
}