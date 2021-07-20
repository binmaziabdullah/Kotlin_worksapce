package kotlinBasics

class ReturnKeyword {

    fun returnInLambda(): String {
        var result = ""
        for (it in "hello_world") {
            if (it == '_') return result
            result += it.toString()
        }
        //this line won't be reached
        return result;
    }

    fun getFun(){
        val x: IntArray = intArrayOf(1, 2, 3)
        val it1 = x.iterator().forEach { println(it)}

        x[0] = x[1] + x[2]
        val it = x.iterator().forEach { print(it) }
    }

}

fun main(){
    val returnKeyword = ReturnKeyword()
    val returnLam = returnKeyword.returnInLambda()
    println(returnLam)

    returnKeyword.getFun()

}