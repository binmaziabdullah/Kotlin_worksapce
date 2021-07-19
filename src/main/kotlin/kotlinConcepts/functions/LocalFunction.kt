package kotlinConcepts.functions

class LocalFunction {
    fun getIncrementNumber(number: Int): Int{
        var j = number
        fun incrementNumber(){
            j++
        }
        for (i in 1..20){
            incrementNumber()
        }
        return j
    }


}

fun main(){

    val localFunction = LocalFunction().getIncrementNumber(1)
    println(localFunction)
}