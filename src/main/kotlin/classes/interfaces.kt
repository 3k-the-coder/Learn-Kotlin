package classes

// interface act as containers of abstract methods and properties
// interface methods can have default declaration
// which is open by nature
// interface properties can't be initialized, and are abstract by default
// interfaces can't be instantiated



interface myInterface {
    var name:String
    fun eat() {
        println("eat")
    }
    abstract fun drink()

}

class MyClass: myInterface {
    override var name: String = "Kunal"
    override fun drink() {
        println("drink")
    }
}

fun main() {
    var classObj = MyClass()
    println(classObj.name)
    classObj.eat()
    classObj.drink()
}