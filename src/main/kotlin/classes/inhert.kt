import classes.BasisInfoProvider
import classes.Person

// classes that is getting inheritance is default final, we have to manually open then with the "open" key word before the class
class FancyInfoProvider : BasisInfoProvider(){
    override val providerInfo: String
        get() = "FancyInfoProvider"

    override val prefix: String
        get() = "Fancy Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy Info ")
    }
}