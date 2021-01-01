package scopeFunctions

/*
there are 5 scope functions
1. with - If you want to operate on a non-null object
2. let - If you want to execute a lambda expression on a nullable obj, and avoid nullPointerException
3. run - If you want to operate on a nullable obj, execute lambda expression and avoid nullPointerException
4. apply - If you want to initialize or configure an object
5. also - If you want to do some additional object configurations or operations

Distinguishing between scope functions

2 factors
1. The way to refer context object either using "this" or "it"
2. The return value, returns either 'context object' or 'lambda result'.
 */

class Person {
    var name: String = "Kunal"
    var age: Int = 22
}