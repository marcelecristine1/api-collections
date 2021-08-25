package one.digitalinnovation.collections

fun main() {
    // atribuindo um array de int a uma variável 'values'

    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("Utilizando o FOR")
// iterando o array e imprimindo os valores do array
    for (valor in values) {
        println(valor)
    }

    println("Utilizando o FOREACH")
// outra forma de iterar um array
    values.forEach {
        println(it)
    }
// ou
    println("Utilizando outro FOREACH")
    values.forEach { valor ->
        println(valor)
    }

    println("Iterando sobre os indices, utilizando um FOR")
    // terceira forma: iterando sobre os indices.
    for (index in values.indices) {
        println(values[index])
    }

    println("Imprimindo do menor para o maior com o método 'sort' do Array")

    values.sort() // chamando o método sort dentro do array que faz ir do menor para o maior
    for (valor in values) {
        println(valor)
    }

}