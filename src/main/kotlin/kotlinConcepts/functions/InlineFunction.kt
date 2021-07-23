package kotlinConcepts.functions

class InlineFunction {

    inline fun addNumbers(a: Int, b:Int, lambda:(Int,Int) -> Int){ //higher order function

        //inline function

        println("inside inline function")
        val sum = lambda(a,b)
        println(sum)
    }

    inline fun getAreaOfTriangle(l: Float,
                                 b: Float,
                                 squareRootOfNumber: (Int) -> Int,
                                 noinline getTriangle: (Float,Float) ->Float,){

        //inline function with noinline modifier
        //only applicable to inline function otherwise ,will get compile time error
        //if you have single functional parameter do use noinline for single function parameter
        //use it when u have multiple functional parameter and want specific one to be not inlined

        println("inline function with specific lambda parameter as noinline")
        val triangle = getTriangle(l,b) //
        val square = squareRootOfNumber(5)
        println(triangle)
    }
}

fun main(){

    val inlineFunction = InlineFunction()

    inlineFunction.addNumbers(5,3) { a, b -> a + b } //trailing lambda

    val triangleLambda : (Float,Float) -> Float = { l: Float, b:Float -> l*b }

    val square: (Int) -> Int = {p ->  p*p}

    inlineFunction.getAreaOfTriangle(5.0f,1.0f, square,triangleLambda)
}