package kotlinBasics

class FuncVariablesStringInterpolation(var length: Int, var breadth: Int) {

    var l: Int = length
    var b: Int = breadth


    fun sumOfIntegers(num1 :Int, num2: Int): Int{
        /*String Templates or String Interpolation to extract or evaluate the statement and concatenate with String*/
     //print("the sum of $num1 and $num2 is : ${num1 + num2}")
        return num1 +num2;

    }

    fun areaOfRectangle(len :Int, bre: Int){
        /*String Templates or String Interpolation to extract or evaluate the statement and concatenate with String
        * we can avoid using + operator*/
        println("The area of rectangle $len and $bre is : ${len * bre}")
    }

}