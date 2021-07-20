package kotlinConcepts.types

open class TypeChecksAndCasts {

     private val string :String = "hi"

    fun typeChecks(){
        println("----explicit type checking----")
        if (string is String){
            println("the assigned type is string")
        }
        else
            println("the assigned type is not string")
    }

    fun smartCasts(name :Any){
        println("----smart check---")

        if (name is String)
        println("the given name is string\n")
        else
            println("not a string")
    }
}
fun main(args : Array<String>){

    val typeChecksAndCasts = TypeChecksAndCasts()
    typeChecksAndCasts.smartCasts("Abdullah")
    typeChecksAndCasts.typeChecks()
}