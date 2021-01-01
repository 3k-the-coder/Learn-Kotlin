package lambdasAndHigherOrderFunctions

// with function can be used to initialize an object


class Person {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }

}

fun main() {
    var person = Person()
    with(person) {
        name = "Kunal"
        age = 21
    }
    // can't call startRun method using with

    // apply method returns a receiver which is a person object in this case so it can call startRun
    person.apply {
        name="Kunal"
        age=21
    }.startRun()
}