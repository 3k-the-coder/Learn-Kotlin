package fundamentals

// functions are created using fun keyword
// return types are specified after the bracket
// void means return type is Unit

fun integerReturningFunction(number:Int): Int {
    return number + 10
}

// to create an object of the class new is not required
class ExampleClass {

    // a class property must be initialized or it should be abstract
    var name: String = "Karan"
    fun display(name:String):Unit {
        println(name)
    }
}

// a constructor should be defined in the class declaration only

class ConstructorExample(var name:String = "Kunal", var age:Int = 22)





fun main() {
    val exampleObject = ExampleClass()
    exampleObject.display("Kunal")

    val constructorExample = ConstructorExample()
    print("${constructorExample.name} -- ${constructorExample.age}")
}