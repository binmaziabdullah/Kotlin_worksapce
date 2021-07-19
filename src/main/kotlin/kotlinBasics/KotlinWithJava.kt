@file:JvmName("CustomizeKotlinFileName")
/*we can customized the kotlin file name as per requirement
* internally at the time of converting .kt file to class compiler will use the user define
* name which was define at top using @file annotation */
package kotlinBasics
    fun main(){
        println("calling java method from kotlin file")
        JavaWithKotlin.areaOfRectangle(5,10)

    }

    fun areaOfRectangle(l :Int, b:Int) :Int{
       return l*b
    }





