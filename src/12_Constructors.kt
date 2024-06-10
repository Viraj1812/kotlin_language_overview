// Constructors

/*
* class has 2 things - properties and methods
* for initialize object and provide default values to properties
* */

fun main(){
    val ob = Calculator()
    println(ob.add(2,3))
    var car = Automobile("Car", tyres = 8,engineType = "Petrol")
    println(car.tyres)
//    var car2 = Automobile("Car2", "Petrol")
//    println(car2.maxSeating)
}

class Automobile(var name: String, var tyres: Int = 4, var maxSeating: Int = 5, var engineType: String) {

    //    init {
//        println("$name is created")
//    }
//    init {
//        println("Hello there")
//    }


    // either use secondary Constructor or use default value
    // Secondary Constructor
//    (nameParam: String, engineType: String) : this(nameParam = nameParam, engineType = engineType)

//    var airBags = hasAirBags
    fun drive(){}
    fun applyBreaks(){}
}

class Calculator{
    fun add(a: Int, b: Int) : Int{
        return a+b
    }

    fun multiply(a: Int, b: Int) : Int{
        return a*b
    }
}