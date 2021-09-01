package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("------------------------------------")
    println(funcionarios.find { it.nome == "Maria"})

    println("-----------------------------------")
    funcionarios
        .sortedBy { it.salario}
        .forEach { println(it) } // ordenando os objetos funcionários da lista funcionari
    // pelo salário

    println("------------------------")
    funcionarios
        .groupBy { it.tipoContratacao } // agrupando por tipo de contratação.
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}