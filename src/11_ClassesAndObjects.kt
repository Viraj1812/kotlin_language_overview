// Classes & Objects

/*
* class is a blueprint or template
* objects are the real thing
* you create objects in your program and they interact with each other to complete the work
* */

fun main(){
    val mustang = Car("mustang",  "petrol",  100)
    val BMWM5 = Car("M5", "diesel", 200)

    println(mustang.name)
    println(mustang.kmRun)

    mustang.driveCar()
    BMWM5.applyBreaks()

    val p1 = Person("A",21)
    val p2 = Person("B", 17)

    println(p1.canVote())
    println(p2.canVote())

    p2.age = 22
    println(p2.canVote())

    val p3 = p2
    p3.age = 25
    println(p3.name)
    println(p2.age)
}


class Car(val name: String, val type: String, var kmRun: Int){
    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBreaks(){
        println("$name Applied Brakes")
    }
}

class Person(val name: String, var age: Int){
    fun canVote(): Boolean{
        return age>18
    }
}