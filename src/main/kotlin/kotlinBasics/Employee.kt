package kotlinBasics

data class Employee(val id: Int, val name: String, val designation : String){
    fun getDetails() : String =
        "id => $id\nname => $name\ndesignation => $designation "

}

fun main(){

    val employee = Employee(1,"Shafay","Software Developer");
    val employee2 = Employee(1,"Shafay","Software Developer");
    val employee3 = Employee(1,"Abm","Jr.Developer");

    //equals method invokes automatically in kotlin for data classes
    if (employee == employee2){
        println("equals method invoked automatically with default implementation\n")
    }

    val id = employee.component1(); //destructing
    val designation = employee.designation

    println("id of a employee is $id\n")
    println("designation of employee $designation\n") //calling toString() internally for data class members
    println("Following are the details of employee\n${employee3.getDetails()}\n")


    val hashCodeForEmployee1 = employee.hashCode()
    val hashCodeForEmployee2 = employee2.hashCode()

    println("hashcode value for employee1 and employee2 are same because both are equal having the same content \n" +
            "$hashCodeForEmployee1 $hashCodeForEmployee2")

}