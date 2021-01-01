package functions

fun methodExample(namedParam: Int): Int {
    return 1
}

// void return type is specified by Unit

// functions can also be used as expressions
// you can have blocks of code but only the last statement will be returned

fun max(a: Int, b: Int): Int = if(a > b) {a} else {b}