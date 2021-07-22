package kotlinConcepts.functions

class HigherOrderFunction

    private val pie = 3.14

    fun getAreaOfTriangle(radius:Float,func: (radius : Float) -> Unit)
    {
       val r = func(radius)
        println("area of circle = $r")
    }

    fun areaOfCircle(radius : Float){
        val calculateArea = pie*radius*radius
        println(calculateArea)
    }


fun main(){
    getAreaOfTriangle(10.0f, ::areaOfCircle)}