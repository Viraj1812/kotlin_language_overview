// Collections

/*
* Lists
*   Mutable List - can be changed, elements can be added/ removed/ replaces
*   Immutable List - Can't be changed -> same as array but main difference is we can modify array element by there index but in this list we can not even do that
*
* Maps
*   Simple Key Value Pair
*       Mutable maps
*       Immutable maps
*
* Sets
*   Mutable Sets
*   Immutable Sets
*
* ArrayList
*
* */

fun main(){

    // Immutable List
    val nums = listOf(1,2,3,"Hello")
    println(nums.indexOf(3))
    println(nums.contains(4))
    println(nums)

//    nums.add
//    nums[1] = 2

    // Mutable List
    val nums1 = mutableListOf(1,2,3,"Hello")
    nums1.add(5)
    nums1.remove(1)
    println(nums1)

    nums1.addAll(nums)
    println(nums1)

    // Maps

    val mp = mutableMapOf<Int, String>()

    mp.put(1,"Hello")
    mp.put(2,"There")

    println(mp.get(1))

    for((key,value) in  mp){
        println("$key = $value")
    }

    mp[8] = "Kotlin"
    println(mp[8])

    val mp1 = mapOf(1 to "Hello", 2 to "There")
    println(mp1)

    // Sets

    //declaring a set of strings
    val setA = setOf("Hello" , "There" , "Kotlin")

    //traversing through a set of strings
    for(item in setA)
        print( item )
    println()


    val arrList = ArrayList<Int>()
    arrList.add(1)


}