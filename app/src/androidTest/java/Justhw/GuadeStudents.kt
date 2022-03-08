package Justhw

class GuadeStudents(name: String, math: Int, english: Int) :
    Student(name, math, english) {   //只有屬性和方法會被繼承 建構子不會
    constructor(name: String) : this(name, 0, 0)
    constructor() : this("", 0, 0)

}

fun main() {
    var jenny = GuadeStudents("Jenny", 78, 92)
    jenny.print()
}