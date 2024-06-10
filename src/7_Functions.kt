// Functions

/*
*  Syntax

  fun functionName(parameter1, parameter2, ...) : ReturnType
  {
      //Block of Statements
      return result
  }

 */

fun main(){
    val answer = add(1,2)
    println(answer)
    evenOrOdd(3)
    val result = multiply(2,5)
    println(result)
    printMessage(3)
    printMessage()

    // lambda
    val result1 = sum1(2,3)
    val result2 = sum2(3,4)
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")

    // directly print the return value of lambda
    // without storing in a variable.
    println(sum1(5,7))
}

// Default Argument
fun printMessage(count : Int = 2){
//    count = 3
    for(i in 1..count){
        println("Hello There")
    }
}

fun add(num1 : Int, num2: Int) : Int
{
    val answer = num1 + num2
    return answer
}

fun multiply(num1: Int, num2: Int) : Int = num1 * num2

fun evenOrOdd(num1 : Int) {
    val result = if (num1 % 2 == 0) "Even" else "Odd"
    println(result)
}

// with type annotation in lambda expression
val sum1 = { a: Int, b: Int -> a + b }

// without type annotation in lambda expression
val sum2:(Int,Int)-> Int  = { a , b -> a + b}
