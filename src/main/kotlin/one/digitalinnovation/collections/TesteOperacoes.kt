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



}