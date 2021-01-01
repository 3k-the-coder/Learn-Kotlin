package classes

// classes in kotlin can be abstract in nature

// abstract methods are the methods which do not contain any definition
// in kotlin anything i.e. abstract is open by default
// abstract methods can be contained only in abstract classes
// abstract class can't be instantiated

// the advantage of abstract classes is that the abstract methods have to be overridden in the child class.

// even a property can be abstract which implies it shouldn't be defined

abstract class Parent {
    abstract var name: String
    abstract fun eat()
    fun drink() {
        println("drink")
    }
}

class Child() : Parent() {
    override var name: String = "Kunal"
    override fun eat() {
        println("eat")
    }
}

fun main() {
    var child = Child()
    println(child.name)
    child.drink()
    child.eat()
}
