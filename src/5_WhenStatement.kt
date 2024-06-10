import java.util.Scanner

fun main(){
    val number = Scanner(System.`in`)
    val userInput = number.nextInt()
    val result = userInput in 1..5 // upper bound included
    val temp = userInput in 1 until 5 // upper bound not included
    println(result)
    println(temp)

//    if(userInput == 1){
//        println("number is 1")
//    } else if(userInput == 2){
//        println("number is 2")
//    } else if(userInput == 3){
//        println("number is 3")
//    } else if(userInput == 4){
//        println("number is 4")
//    } else if(userInput == 5){
//        println("number is 5")
//    } else{
//        println("number is greater than 5")
//    }

    when(userInput){
        1 -> println("number is 1")
        2 -> println("number is 2")
        3 -> println("number is 3")
        4 -> println("number is 4")
        5 -> println("number is 5")
        else -> println("number is greater than 5")
    }

    // when as an Expression
    val tmp = when(userInput){
        1 -> "number is 1"
        2 -> "number is 2"
        3 -> "number is 3"
        4 -> "number is 4"
        5 -> "number is 5"
        else -> "number is greater than 5"
    }

    println(tmp)
}