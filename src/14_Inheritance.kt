// Inheritance

/*
*  Code Reusability
*  open keyword
*  cannot inherit from multiple classes
*  parent class constructor is called before child class constructor
* */

fun main(){
    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
}

open class Parent{

    init {
        println("Parent")
    }

    val name : String = ""

    fun myMethod(){
        println("I am in parent")
    }
}

class Child : Parent(){

    init {
        println("Child")
    }

    val name2 : String = ""
    fun myMethod2(){
        println("I am in Child")
    }
}