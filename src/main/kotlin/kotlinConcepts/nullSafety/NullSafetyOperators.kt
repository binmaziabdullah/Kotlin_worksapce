package kotlinConcepts.nullSafety

class NullSafetyOperators {


    //in kotlin variable of particular type cannot hold null value/reference
    //to make any variable of particular type to hold null value that is called variable of nullable type
    fun safeCastOperator() {

        var name: String? = null
        //println("length of string is ${name.length}") //compile time error

        //safe cast operator ?.
        println("***** Starting of safeCastOperator function *****\n")
        println("length of string is ${name?.length}")

        name = "ABM"
        println("After modifying name length of string is ${name?.length}\n")

        println("***** Ending of safeCastOperator function *****\n\n")

    }

    fun elvisOperator() {

        //println("length of string is ${name.length}") //compile time error

        //elvis operator is like ternary operator in java it is a shorthand of if else to handle null case reference

        /*if (name!=null)
             name.length
         else
             "string is null"*/
        println("***** Starting of elvisOperator function *****\n")

        var name: String? = null

        val elvisExpression = name?.length ?: "name is null"
        println("$elvisExpression\n")

        name = "Shafay"
        val elvisExpression1 = name?.length ?: "name is null"
        println("After modifying name length of string is $elvisExpression1\n")

        println("***** Ending of elvisOperator function *****\n\n")

    }

    fun nullAssertionOperator() {

        //null Assertion operator is used when we are sure that value cannot be null
        //otherwise it will through NPE

        println("***** Starting of nullAssertionOperator function *****\n")
        val name: String? = "Saud"

        val length = "length of string is ${name!!.length}\n" //NPE if value is null
        println(length)

        println("***** Ending of nullAssertionOperator function *****\n")
    }

    fun letWithSafeCastOperator() {

        //null Assertion operator is used when we are sure that value cannot be null
        //otherwise it will through NPE

        //we can use filterNotNull function to filter NonNull elements
        //by using also function we can perform extra operation on nullable type/reference

        val name: String? = "Amit"
        name?.let {
            println("length of string is ${name?.length}")
        }
    }
}
fun main(){

    val safetyOperators = NullSafetyOperators()

    safetyOperators.safeCastOperator()
    safetyOperators.elvisOperator()
    safetyOperators.nullAssertionOperator()
    safetyOperators.letWithSafeCastOperator()
}
