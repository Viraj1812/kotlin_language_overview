import kotlin.math.pow

// Function Overloading

/*
* Same name different parameters
*   Either number of parameters is different
*   Or Type is different
* */

fun main(){
//    println(addition(1,2))
    println(addition(1.0,2.0))

    var fn = ::addition
    println(fn(1.0,2.0))

    fn = ::power
    println(fn(2.0,3.0))
}

//
//fun addition(a: Int, b: Int) : Int{
//    return a+b
//}

fun addition(a: Double, b: Double) : Double{
    return a+b
}

fun power(a: Double, b: Double) : Double{
    return a.pow(b)
}