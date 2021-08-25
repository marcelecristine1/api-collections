package one.digitalinnovation.collections

fun main() {

    // chamando a classe Array para inicializar um array de String de tam 3
    val nomes = Array(3) {" "} // o valor vazio já infere que o array é de string

    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    println("Iterando array de string utilizando o FOR")

    for (nome in nomes) {
        println(nome)
    }

    nomes.sort()

    println("Iterando com FOERACH depois de ter ordenado os valores com o 'sort'")

    nomes.forEach {
        println(it)
    }

    // declarando e inicializando array com arrayof
    val nomes2 = arrayOf("Melanie", "Zilda", "Pedro")

    println("----------------------")
    nomes2.sort()

    nomes2.forEach {
        println(it)
    }

}