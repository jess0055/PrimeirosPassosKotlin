package br.com.digitalhouse.collections


fun main() {

    //Exercicio 1
    val loteria = mutableMapOf<Int, String>()

    loteria.put(0, "Ovos")
    loteria.put(1, "Água")
    loteria.put(2, "Escopeta")
    loteria.put(3, "Cavalo")
    loteria.put(4, "Dentista")
    loteria.put(5, "Fogo")

    loteria.toMap()

    println(loteria)

    //Exercicio 2
    val apelidos = mapOf<String, List<String>>(
            "Joao" to listOf("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf("Lukinha", "Jorge", "George"))

    apelidos.forEach{apelido ->
        println(apelido) }

    //Exercicio 3
    val listaNum = mutableListOf<Int>()
    //listaNum.add(1,5,5,6,7,8,8,8)

    val setNum = mutableSetOf<Int>(1,5,5,6,7,8,8,8)
    //setNum.addAll(1,2,3,4,5)


}