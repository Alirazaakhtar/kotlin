fun main(){

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{(key , value) -> println("$key = $value")}

    val map2 = mutableMapOf(4 to "d", 5 to "e", 6 to "f")

    map2.forEach { (key, value) -> println("$key -> $value") }

    map2[7] = "g"

    map2.forEach { (key, value) -> println("$key is $value") }


    var mapper = mapOf(1 to "Hello", 2 to "world")

    println("NEW MAP")

    println(mapper.getValue(2))

    var code = mutableMapOf(1 to "Braa", 2 to "Cheatcode")

    code.forEach { (key, value) ->
        println("key: $key and value: $value")
    }

}