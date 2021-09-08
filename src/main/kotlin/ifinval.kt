val name: String? = null
var hello: String? = null

var num: Number? = null

fun main(){

    //hello = "Hello everybody?"

    val greetingToPrint = if (hello != null) hello else "HI"

    val PrintName = if(name != null) name else "no name"

    num = 2
    val NumToPrint = when(num){
        null -> "This is NULL"
        1 -> "1"
        2 -> "2"
        3 -> "3"
        else -> "More then 3"
    }

    println(NumToPrint)


    println(greetingToPrint)

    println(PrintName)

}
