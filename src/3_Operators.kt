// Operators

/*
* Arithmetic Operators ( +, - , *, /, %)
* Relational Operators ( > , < , >= , <= , == , != )
* Pre/Post Increment or Decrement Operator ( i++ , ++i , i-- , --i )
* Logical Operator ( && , || , ! )
* */

fun main(){

    val i = 5
    val j = 2

    println( i + j)  // 6
    println( i - j)  // 2
    println( i * j)  // 8
    println( i / j)  // 2
    println( i.toFloat() / j) //2.5
    println( i % j)  // 1

    var k = 2
    k++
    k--
    println(k)

    var m = 1
    println(m++) // post Increment
    println(m)
    println(++m) // pre Increment

    println(m++ + ++m) // 3 + 5 = 8

    val condition1 = false
    val condition2 = false

    // && - and
    var result = condition1 && condition2
    println(result)

    // || - or
    result = condition1 || condition2
    println(result)

    // ! - not
    print(!result)

}