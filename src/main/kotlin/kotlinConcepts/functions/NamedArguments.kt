package kotlinConcepts.functions

open class NamedArguments {

    fun sumOfNumbers(number1: Int, number2: Int){
            println("sum of two number is : ${number1+number2}")
    }

    fun getPerson(id: Int, name :String ="Abdullah", age :Int = 20){
        println("Id = $id name of the person = $name and age = $age")
    }
}

fun main(){

    //when using named parameter we can have parameter argument in any order

    val namedArguments = NamedArguments()
    namedArguments.sumOfNumbers(number2 = 15, number1 = 10) //swapping value of parameter will not raise any error
    namedArguments.getPerson(1,"Abdullah",) //it is valid default value age is skip
    // => namedArguments.getPerson(1,25,) // it will cause error
    namedArguments.getPerson(1,age = 2,) // to resolve above error use skip default values with named arguments


}
