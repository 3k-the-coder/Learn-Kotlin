package classes

// each and every class in kotlin has a parent class called "Any",
// which provides methods such as .equals, .hashCode, .toString

// use data classes when you are concerned with only the data not with the objects

// in case of data classes, primary constructor should contain only properties i.e. var/val

data class MyDataClass(var name: String, var age: Int)