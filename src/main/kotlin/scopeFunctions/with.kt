package scopeFunctions





fun main() {
    val person = Person()
    println("${person.name}\n${person.age}") // redundancy in usage person to access each property
                                                // if the class had 1000 properties then we have to repeat person
                                                 // same number of times

    println("Using with")

    with(person) {
        println(name)
        println(age)
    }

    /*
        returns: lambda result
        context object: this
     */
}