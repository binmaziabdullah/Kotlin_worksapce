package kotlinConcepts.functions

class VarargKeyword {

    //vararg is nothing but a variable holding multiple data ,you can consider it as a array
    fun varArgumentFunction(vararg numbers: Int){
        for (i in numbers){
            println(i)
        }

    }
}
fun main(){
    //we can pass zero or multiple numbers
    val varargKeyword = VarargKeyword().varArgumentFunction(1,2,3,4,5,6,)

}