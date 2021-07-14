package kotlinBasics



@Suppress("DEPRECATED_IDENTITY_EQUALS")
class Ranges {

    private val range = 0..20   //1 to 20

    private val charRange = 'a'..'r'   //A to Z

    private val num = 15 downTo 1

    private val  iterate = num.iterator()

    fun getRange(){
        println("iterating num through iterator")
            while (iterate.hasNext()){
            val next = iterate.next()
            print(" $next")
        }
        println()

    }

    fun getChar(){
        println("iterating char through forEach")
        charRange.forEach{ t -> print(" $t") }
        println("\n")


    }

    fun getEvenOrOddUsingStepInRange(){
        println("********Even numbers*********")
        for (i in range step 2){
            print(" $i")
        }
        println("\n")

        println("********Odd numbers*********")

        val r = range.filter { r -> r%2 !==0}
        println("Odd Numbers :$r")
        println("\n")
    }

    fun rangeWithAggregateFunctions(){
        println()
        println("Range with Aggregate Functions\n")
        val sum = range.sum()
        println("Sum of the given range is =$sum ")

        val min = range.minOrNull()
        println("Sum of the given range is =$min ")

        val avg = range.average()
        println("Sum of the given range is =$avg ")
        println("\n")
    }

}
    fun main(){
    val range = Ranges()
        range.getChar()
        range.getEvenOrOddUsingStepInRange()
        range.getRange()
        range.rangeWithAggregateFunctions()

    }