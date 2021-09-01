package one.digitalinnovation.collections

class Repositorio<T> {
    // simulando um banco de dados com um pequeno repositório
    private val map = mutableMapOf<String, T >()

    fun create(id: String, value: T){
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map.get(id) // função que recebe parâmetro e retorna um mapa.

    fun findAll() = map.values

}