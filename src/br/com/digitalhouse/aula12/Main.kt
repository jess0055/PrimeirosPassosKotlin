package br.com.digitalhouse.aula12

fun main() {

    val pessoa1 = Pessoa ("jess", "fer", 1234)
    val pessoa2 = Pessoa ("jess", "fer", 12345)

    println(pessoa1.toString())
    //br.com.digitalhouse.aula12.Pessoa@4e50df2e = sem data class
    //Pessoa(nome=jess, sobrenome=fer) = com data class

    println(pessoa1.equals(pessoa2))
    //true - com data class
    //false - sem data class, pq compara endereço de memória, true apenas de sobrescrever equals


   val lista = mutableListOf<Int>(1,2,3,4,5)
   println(lista.contains(2))
}