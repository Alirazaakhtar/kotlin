fun sayHello(greeting: String, name:String){
    val msg = "$greeting $name"
    println(msg)
}

fun sayHello1(greeting: String, name:String) = println("$greeting $name")

fun main(){

    sayHello("hey", "koylin")
    sayHello("Hi", "Ali")

    sayHello1("hello", "David")
}