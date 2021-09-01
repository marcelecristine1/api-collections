package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro) // setof é um conjunto
    val funcionarios2 = setOf(maria)

        // fazendo a união dos dois conjuntos e imprimindo
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("--------------")
    // outras operações (realizando um subtração
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("----------------")
    // realizando uma interseção
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }


}