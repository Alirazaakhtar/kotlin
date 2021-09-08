package classes

import java.util.*

//enum class

enum class EntityType{
    HELP, EASY, MEDIUM, HARD;


}

sealed class EntityFactory{
    fun create(type : EntityType) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> "Medium"
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.name
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

open class Entity(){

    object Help : Entity(){
        val name = "Help"
    }


    data class Easy(val id : String, val name :  String): Entity()
    data class Medium(val id : String, val name :  String): Entity(){
        fun printInfo(){
            println("id: $id")
        }
    }
    data class Hard(val id : String, val name :  String, val  multiplier: Float): Entity()

}

/* Laver en ny metode i data klassen
fun Entity.Medium.printInfo(){
    println("id: $id")
}
*/


fun main(){

    Entity.Medium("2", "Ali").printInfo()

/*
    val entity : Entity = EntityFactory().create(EntityType.EASY)
    val msg = when(entity){
        is Entity.Easy -> "Easy class"
        is Entity.Hard -> "Hard class"
        Entity.Help -> "Help class"
        is Entity.Medium -> "Medium class"
    }

    println(msg)

*/



}