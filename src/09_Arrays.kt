// Arrays

/*
* Arrays
*
* Object that stores multiple values of same type
* Fixed Size
* */

fun main(){
    var arr = arrayOf(1,2,3)

    for(i in arr){
        println(i)
    }

    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    //access the element
    println(arr[0])
    println(arr.get(1))

    //set the value of element
    arr[0] = 2
    arr.set(2,4)
    println(arr[2])

    //size
    println(arr.size)
}