package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("Add um funcionário da lista mutável")
    // add um novo funcionário na lista, pois a lista é mutável

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("Removendo um funcionário da lista mutável")
    // removendo um funcionario da lista
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("Mutableset")
    val funcionarios2 = mutableSetOf(joao)
    funcionarios2.forEach { println(it) }

}