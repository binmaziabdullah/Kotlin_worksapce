package kotlinConcepts.equality

fun main(){

  val e = ChecksForEquality()
  e.structuralEquality()
  e.referentialEquality()

}

class ChecksForEquality{

  val a = StructuralAndReferentialEquality("Abdullah", 20)
  val b = StructuralAndReferentialEquality("Abdullah", 20)

  fun structuralEquality(){
    val m = if (a==b) "contents are same" else "both have different contents"
    println(m)
  }

  val c = StructuralAndReferentialEquality("Abdullah", 20)
  val d =  c //new object with existing reference

  fun referentialEquality(){
    val k = if (c===d) "objects are pointing to same memory locations" else "both have different reference"
    println(k)
  }
}

data class StructuralAndReferentialEquality(val name:String, val age: Int)
