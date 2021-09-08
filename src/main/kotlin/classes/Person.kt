package classes

class Person( val firstName : String = "Peter", val lastName : String = "Parker"){

    // getter og setter er som regel indbygget, men det er muligt at lave custom
    var nickName : String? = null
        set(value) {
            field = value
            println("the new nickname is change")
        }
        get() {
            println("The returned value is $field")
            return field
        }

    //metoder

    fun printInfo(){
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName, $lastName, $nickNameToPrint")

    }


}






fun main(){
    val person = Person("Ali", "RAza ")

    println(person.lastName)
    println(person.firstName)


    println(person.nickName)

    person.printInfo()
}