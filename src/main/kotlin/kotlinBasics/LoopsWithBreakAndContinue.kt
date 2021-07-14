package kotlinBasics

import kotlin.math.abs

class LoopsWithBreakAndContinue {

    //in kotlin loops are same as in java and

    fun forLoop(){
       loop@ for(i in 1..3){
            for (j in 1..3){
                if (i ==2 && j ==2){
                    break@loop
                }
                print("[$i] [$j]")

                println()
            }

        }
        println()
    }
    fun forLoopWithContinue(){
        for(i in 1..3){
            for (j in 1..3){
                if (i ==2 && j ==2){
                    continue
                }
                print("[$i] [$j]")

                println()
            }

        }
        println()

    }

    fun whileLoop(){
        var i =1
        while (i<=10){
            print(" $i")
            i++
        }
        println()
    }

    fun doWhileLoop(){
        var i = 1
        do {
            println("do while loop")
            i++
        }
        while (i<5)
    }

    fun funcAsAnExpression(a: Int,b :Int) : Int =
        if (a>b) {
            println("$a is largest between $a and $b")
            a} else {
                println("$b is largest between $a and $b")
            b}
    fun funcAsAnExpression2(a: Int,b :Int) : Int = a + b

}
    fun main(){
        val obj = LoopsWithBreakAndContinue()
        obj.forLoop()
        obj.forLoopWithContinue()
        obj.whileLoop()
        obj.doWhileLoop()
        obj.funcAsAnExpression(5, 1)
        val sum = obj.funcAsAnExpression2(5, 2)
        println("sum of number is : $sum")

    }