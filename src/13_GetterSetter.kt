fun main(){
    val p1 = PersonClass("hello", -1)
    println(p1.age)
//    p1.age = 23
    p1.age = -12
    println(p1.age)
    println(p1.name)
}

class PersonClass(nameParam: String, ageParam: Int){

    lateinit var message: String // it can not be val type, and we can not define it as Int, Bool, Float

    val name: String = nameParam
        get() {
            return field.uppercase()
        }

    var age: Int = ageParam
        set(value) {
            if (value>0){
                field = value
            }
            else{
                println("age can't be negative")
            }
        }
}