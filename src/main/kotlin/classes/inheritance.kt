package classes

// by default classes in kotlin are public and final
// to make classes inheritable, make use of open keyword


// to override a method it needs to be declared as open
// and the overriding definition needs to be declared as override

// super can be used to refer parent class



open class Animal {
    var name: String = ""
    constructor(name: String) {
        this.name = name
        println("animal constructor")
    }
    open fun eat() = println("Animal")
    fun animalSpecific() = print("Animal private")
}

class Dog: Animal {
    constructor(): super("dummy") {
        println("dog constructor")
    }
    override fun eat() = println("Dog")
    fun dogSpecific() = print("Dog specific")
}

fun main() {

    var animal: Animal = Dog()
    animal.eat()
    animal.animalSpecific()

}
