package functions

// the purpose of extension functions is to add a specific functionality to the existing class
// without having to extend the class.
// the new functions behaves and internally work as static functions

class Student {
    fun hasPassed(marks: Int): Boolean = marks > 40
}

// if at anytime we feel we want new functionality in the existing class
// we can make use of extension classes to provide that functionality

fun Student.isScholar(marks: Int): Boolean = marks > 95

fun main() {
    var student = Student()
    println("Student has passed ${student.hasPassed(57)}")
    println("Student has scholarship ${student.isScholar(57)}")
}

// extension functions can be a part of user defined classes or inbuilt classes
// improves code readability