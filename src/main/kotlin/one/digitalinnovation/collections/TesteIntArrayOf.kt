package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7) // inicializando um array e passou os valores

    println("Iterando o array com FOREACH")

    values.forEach {
        println(it)
    }

    println("Ordenando os valores")

    values.sort()

    values.forEach {
        println(it)
    }


}