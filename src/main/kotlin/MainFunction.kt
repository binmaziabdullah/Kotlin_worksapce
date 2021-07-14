import kotlinBasics.FuncVariablesStringInterpolation

fun main() {

    val obj = FuncVariablesStringInterpolation(5, 2)
    var l = obj.l
    var b = obj.b

    obj.areaOfRectangle(l,b)
    println("sum of $l and $b is ${obj.sumOfIntegers(l,b)}")
}