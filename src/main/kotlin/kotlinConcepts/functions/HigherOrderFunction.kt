package kotlinConcepts.functions

class HigherOrderFunction

    private val pie = 3.14

    fun getAreaOfTriangle(radius:Float,func: (radius : Float) -> Unit)
    {
        println("inside getAreaOfTriangle function and calling areaOfCircle function")
       func(radius)
    }

    fun areaOfCircle(radius : Float){
        val calculateArea = pie*radius*radius
        println(calculateArea)
    }


fun main(){
    getAreaOfTriangle(10.0f, ::areaOfCircle)}