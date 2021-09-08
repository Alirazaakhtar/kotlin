fun main(){
    /*
    val list = listOf("Kotlin", "Java", "C#", "Javascript", null)
    list.filterNotNull()
        .filter {
        it.startsWith("J")
        }
        .map {
            it.length
        }
        .forEach {
        println(it)
    }

     */


    val list = listOf("Kotlin", "Java", "C#", "Javascript", null)

    list
        .filterNotNull()
        .filter {
        it.startsWith("J")
        }
        .map {
            it.length
        }
        .forEach {
            println(it)
        }

    val map = list.filterNotNull()
        .associate {
        it to it.length }

    println(map)


    val lang = list
        .filterNotNull()
        .find {
        it.startsWith("Java")
        }
        .orEmpty()

    println(lang)

    }

