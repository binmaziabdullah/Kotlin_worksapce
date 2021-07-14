package kotlinBasics

import java.util.*

class IfAndWhenAsExpression {

    //we can use conditional statement if and when as an expression

    fun ifAsExpression() {
        println("Enter your age")
        val system = Scanner(System.`in`)
        var age = system.nextInt()
        var eligibility = if (age >= 18) {
           "you are eligible to vote"
        }
        else if(age <0)
            "please! enter a valid number"
        else
            "you are not eligible to vote"
        println(eligibility)
    }

    //when expression is more of a switch case statement

    fun whenAsExpression1(){
        println("Enter your cibil score")
        val system = Scanner(System.`in`)

        val result = when(system.nextInt())
        {
            500 -> "You eligible for EMI credit card"
            390 -> "You almost close to be the eligible candidate"
            100-> "You are not eligible for EMI credit card"
            else -> "Not a valid number"
        }
        print(result)
    }
}

fun main(){
    val obj = IfAndWhenAsExpression()
    obj.ifAsExpression()
    obj.whenAsExpression1()


}