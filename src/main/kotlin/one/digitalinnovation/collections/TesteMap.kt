package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    // pair = pares (no Kotlin)... une chave e valor

    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    ) // recurso do kotlin
    println("map 2")
    map2.forEach { k, v -> println("Chave: $k - Valor: $v") }



}