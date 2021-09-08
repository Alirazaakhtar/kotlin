fun printList(greeting: String, itemsToGreet: List<String>){
    itemsToGreet.forEach {
        println("$greeting to $it")
    }
}

fun main(){

    val list = listOf("Kotlin", "Cheese", "Food", "Cars")

    list.forEach { item ->
        println(item)
    }

    for(item in list){
        println("List contains: $item")
    }

    // for at tilføje til listen skal vi bruge mutable

    val list2 = mutableListOf("Ali", "Raza", "Akhtar")

    list2.add("Han")
    list2.add("Skal")

    list2.forEach {
        println(it)
    }

    printList("As salamu 'Alaykum", list2)

    ///// ---------- ny liste

    var drinks = mutableListOf("Cola", "Sprite")

    println("NEW LIST STARTS HERE")


   // drinks.add("Shake")

   drinks.forEach { drink ->
       if(drink == "Shake"){
           println("This is the real deal: $drink")
       }
   }


}