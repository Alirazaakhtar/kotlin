//you can put deafault values in the patameter
fun greetPerson(greeting:String = "Hello", name:String = "Amin") = println("$greeting $name")

fun main(){

// if you define the thing in the parameter, then it makes no deference if they change positions
    greetPerson(name = "Ali", greeting = "Salam")

    greetPerson(name = "H")
}