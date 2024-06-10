// Loops

/*
* for
* while
* do-while
* */

fun main(){

    for (i in 1..5){
        println(i)
    }

    for (i in 1..5 step 2){
        println(i)
    }

    for (i in 1 until 5){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }

    var count = 5
    while(count >= 1)
    {
        println("number is $count")  //String Templating
        count--
    }

    var temp = 5
    do {
        println("Hello There")
        temp--
    } while (temp>5)
}