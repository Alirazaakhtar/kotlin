var doors: String? = null
var walls: String? = null

fun house(doors: Int, walls: Int){

    if(doors > 4 && walls > 4){
        println("The house is big")
    }
    else if(doors > 3 && walls > 3){
        println("The house is medium")
    }
    else{
        println("The house is small")
    }

}

fun sayGretting(greeting:String = "Hello", name:String = "Ali") = println("$greeting to $name")

fun main(){
    println("Hello World")

    house(4, 4)

    sayGretting(name = "Jeff", greeting = "Food®")

}