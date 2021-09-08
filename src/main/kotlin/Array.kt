var firstname: String? = null
val lastname = "Ali"


fun sayHello(to : String) = "Hello $to"



fun main(){

    val items = arrayOf("Kotlin", "Programming", "Food")
    val list = arrayOf(1,2,3,4)

    println(items.size)

    //print frist element
    println(items[0])
    println(items.get(0))

    // basic loop
/*
    for(item in items){
        println("Item: $item")
    }

   items.forEach {
       println("it: $it")
   }
*/

    items.forEachIndexed { index, item ->
        println("$item is at index $index")
    }

    items.forEachIndexed { index, item ->
        println("this index number $index is for $item")
    }


list[3] = 6

  list.forEach{ element ->
      println(element)
  }

    list.forEachIndexed{index, element ->
        println("$index $element")
    }

}