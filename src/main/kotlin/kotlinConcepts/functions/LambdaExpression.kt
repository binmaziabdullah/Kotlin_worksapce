package kotlinConcepts.functions


class LambdaExpression {

    //higher order function -is a function which taking function as a parameter
    // or returning a function from a function itself
    fun addNumbers(a: Int, b:Int, lambda:(Int,Int) -> Int){ //higher order function

        val sum = lambda(a,b)
        println(sum)
    }

    fun getAreaOfTriangle(l: Float, b: Float, getTriangle: (Float,Float) ->Float){
        val triangle = getTriangle(l,b) //
        println(triangle)
    }
}

fun main(){

    val lambdaExpression = LambdaExpression()

    lambdaExpression.addNumbers(5,3) { a, b -> a + b } //trailing lambda

    val triangleLambda : (Float,Float) -> Float = { l: Float, b:Float -> l*b }

    lambdaExpression.getAreaOfTriangle(5.0f,1.0f, triangleLambda)
}