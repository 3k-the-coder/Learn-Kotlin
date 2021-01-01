package iterators

// break by default will come out of the nearest loop

// inorder to break out of a specific loop we can make use of LABELLED FOR loop

// i.e. giving a name to the forloop which can be later used to break out of the loop

fun main() {
    for(i in 1..3) {
        for(j in 1..3)
        {
            print("$i $j")
            if(i==2 && j==2)
                break // this will break j loop i.e. nearest loop
        }
    }
    println()

    myLoop@ for(i in 1..3) {
        for(j in 1..3)
        {
            print("$i $j")
            if(i==2 && j==2)
                break@myLoop // this will break j loop i.e. nearest loop
        }
    }
}
