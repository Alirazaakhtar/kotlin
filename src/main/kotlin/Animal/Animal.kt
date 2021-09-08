package Animal

interface Animal {
    val name: String
    val color: String

    fun run()

    fun eat(){
        println("$name is eating")
    }

}
