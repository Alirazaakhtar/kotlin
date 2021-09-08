package classes;

import FancyInfoProvider

interface IPerson{
    val providerInfo : String

    fun printInfo(person : Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId() : String
}

open class BasisInfoProvider : IPerson, SessionInfoProvider {
    override val providerInfo: String
        get() = "Basic info provider"

    protected open val prefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional print statement")
    }

    override fun getSessionId(): String {
        return prefix
    }
}


fun main(){

   val provider = object : IPerson{
       override val providerInfo: String
           get() = "New info provider"

       fun getSessionId() = "id"
   }

    provider
    provider.printInfo(Person())
    println(provider.getSessionId())

    checkTypes(provider)
}


fun checkTypes(infoProvider: IPerson){
    if(infoProvider !is SessionInfoProvider){
        println("Is not a Session Provider")
    }
    else{
        println("Is a session provider")
        // how to cast infoprovider

        (infoProvider as SessionInfoProvider).getSessionId()


    }
}

/*
interface IPerson{
    val info :  String

    fun provideInfo(person : Person){
        println(info)
        person.printInfo()
    }

    fun drive(name : String){

    }
}

class Provider : IPerson{
    override val info: String
        get() = "Info provider"

}

fun Animal.main(){
    val provider = Provider()

    provider.provideInfo(Person())
}

 */
