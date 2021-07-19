package kotlinConcepts.functions

open class DefaultFunctionsArgument {

    fun sumOfTwoNumbers(a: Int, b: Int = 5){
            println("sum of two number is : ${a+b}")
    }

    open fun sumOfThreeNumbers(a: Int, b: Int =10){

    }
}

fun main(){

    val functions = DefaultFunctionsArgument();
    functions.sumOfTwoNumbers(5) //it is fine if we skip default function parameter,default value will be used

    val classB = B();
    classB.sumOfThreeNumbers(5)


}

/*default function parameter in case of function overloading*/
class B : DefaultFunctionsArgument() {
    /*
    for following code compile time error occur if provide default values
    *  override fun sumOfThreeNumbers(a: Int, b: Int = 15) {
        super.sumOfThreeNumbers(a, b)
        println("sum of three numbers is ${a+b}") //using the default value of b from parent/base function

    }
    An overriding function is not allowed to specify default values for its parameters
    * */

    override fun sumOfThreeNumbers(a: Int, b: Int) {
        println("sum of three numbers is ${a+b}") //using the default value of b from parent/base function

    }
}