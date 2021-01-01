package functions

/*
* kotlin and java files are interoperable i.e. we can call kotlin code from a Java class and vice versa.
* by making use of the default naming convention, myClass.kt will be converted into a class called MyClassKt.class
* which will be provided as input to the JVM which runs it.
* In java default functions are not possible(fns with default argument values)
* in order to use kotlin default functions in Java we can make use of @JvmOverloads annotation.
* while defining the kotlin function that has default params.
 */