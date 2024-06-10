fun main(){
    val onePlus = OnePlus()
    onePlus.display()
    onePlus.powerOff()
}

open class Mobile(){
    open val name : String = ""
    val size: Int = 5
    fun makeCall() = println("Calling From Mobile")
    open fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus : Mobile(){
    override fun display() = println("One Plus Display")

    override fun powerOff() {
        super.powerOff()
        println("One Plus Power off")
    }
}