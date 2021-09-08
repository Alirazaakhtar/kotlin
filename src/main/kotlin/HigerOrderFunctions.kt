/*

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){
     list.forEach {
         if (predicate?.invoke(it) == true){
             println(it)
         }
     }
 }

 val predicate: (String) -> Boolean = {
     it.startsWith("J")
 }

fun getPrintPredicate(): (String) -> Boolean {
    return {it.startsWith("J")}
}


 fun main(){
     val list = listOf("Kotlin", "Java", "Python", "C#")

     printFilteredStrings(list, getPrintPredicate())
 }

 */


fun printFilteredStrings(list: List<String>, predicate: (String)->Boolean){
    list.forEach {
        if (predicate(it)){
            println(it)
        }
    }
}


fun getPre(): (String) -> Boolean{
    return {it.startsWith("J")}
}

fun main(){

    val list = listOf("Java", "Kotlin", "Javascript")

    printFilteredStrings(list, getPre())

}