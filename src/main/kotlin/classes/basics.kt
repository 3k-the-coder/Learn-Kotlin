package classes

// in kotlin constructors defined in class headers only
// in order to initialize or perform anything on the constructor fields we can make use of init block
// parameter is something that is passed to the constructor
// and property is the field defined inside the class

// we can define this property in the constructor only by using var or val


class Student(var name: String)  {
    init {
        println("The name is ${this.name}")
    }
    // kotlin allows having secondary constructor with one catch that you should call primary constructor
    // from sec constructor, syntax is as follows
    // you can't declare properties inside secondary constructors

    constructor(name: String, id: Int): this(name) {

    }
}

// from a secondary constructor you have to mandatorily call primary constructor
// if you have () in front of your class definition

class Employee {
    constructor(name: String) {

        // no need to call primary constructor because class definition doesn't include primary constructor


    }
}

fun main() {
    var student = Student("Kunal")

}

