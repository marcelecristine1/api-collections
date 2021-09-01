package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1000.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>() // instanciando um objeto

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("-----------------------------------")
    println("Trazendo todos os elementos do mapa")
    repositorio.findAll().forEach { println(it) }

    println("------Exlcuindo e imprimindo o elemento maria--------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}