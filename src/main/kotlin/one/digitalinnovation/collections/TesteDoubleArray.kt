package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println("Iterando com forEach.....")
    salarios.forEach { println(it) }

    println("Outra forma de iterar com forEachIndexed e aplicando 10% de bônus no salário.....")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1 // dando 10% de aumento no salário

    }

    salarios.forEach {
        println(it)
    }

    // declarando outro array

    val salarios2 = arrayOf(7000.0, 2000.0, 4500.0)

    println("Iprimindo novo array de double")

    salarios2.forEachIndexed { index, d -> println(d) }

    //ordenando os valores
    salarios2.sort()
    println("Imprimindo agora com valores ordenados")
    salarios2.forEachIndexed { index, d -> println(d) }

}