package Justhw

open class Student //constructor//類別的可省略 裡面的不可以  加入open 開放繼承
    (var name: String, var math: Int, var english: Int) {  //只有主要建構值可以用var val
    //var name :String?=null
    //var english:Int= 0
    //var math:Int= 0
    constructor() : this("", 0, 0)//次要建構子要定義上面的初始值
    constructor(name: String) : this(name, 0, 0) {
        print("Hi")
    }

    fun print() {
        println("$name\t$english\t$math\t${(english + math) / 2.0f}")
    }

    fun average(): Float {
        return (english + math) / 2.0f
    }

    private fun average2() = (english + math) / 2

    fun max(a: Int, b: Int) = if (a > b) a else b

    fun highest() = if (english > math) english else math

    fun grating() = when (average2() / 10) {
        in 9..10 -> 'S'
        8 -> 'A'
        7 -> 'B'
        else -> 'F'
    }

}
fun main() {
    val jack = Student("Jack", 85, 74)
    val cc = Student("cc", 91, 96)
    //jack.name= "Jack"
    //jack.english=85
    //jack.math=60
    //.print()
    cc.print()
    println(jack.average())
    println(cc.highest())
    println(cc.grating())


}