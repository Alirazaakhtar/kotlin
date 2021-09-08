fun sayHello(greeting : String = "Hello", vararg itemList : String){
    itemList.forEach { item ->
        println("$greeting $item")
    }
}

var food: String? = null

var buy = if(food != null) food else "Hi"
fun main(){

    val food = arrayOf("Pizza", "Shawarma", "Donut, Burger")

    sayHello("Hello",  *food)

    println(buy)

}