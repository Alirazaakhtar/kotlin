package Animal

open class Tiger(private val _name : String) : Animal, House {
    override val name: String
        get() = _name

    override val size: Int
        get() = 200

    override val color: String
        get() = "Yellow"

    override fun run() {
        println("$name is running")
    }

}