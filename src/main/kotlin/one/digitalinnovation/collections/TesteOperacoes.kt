package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2250.0
    salarios[2] = 4050.0
    //iterando e imprimindo os valores do array
    println("Iprimindo os valores do array salarios")
    for (salario in salarios) {
        println(salario)
    }

    println("--------------------")
    println("O maior salário é: ${salarios.maxOrNull()}")
    println("O menor salário é: ${salarios.minOrNull()}")
    println("A média salarial da empresa é: ${salarios.average()}")

    println("-------------------")
    println("Salários maiores que 2500:")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0  }
    salarioMaiorQue2500.forEach { println(it) }

    println("-------------------")
    println("Quantos salários estão entre 2000 a 5000?")

    println(salarios.count { it in 2000.0..5000.0 })

    println("----------------------")
    // buscando valores específicos
    println(salarios.find { it == 4050.0 })
    println(salarios.find { it == 100.0 })

    println("--------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })



}