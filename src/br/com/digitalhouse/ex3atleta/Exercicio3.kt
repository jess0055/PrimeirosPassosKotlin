package br.com.digitalhouse.ex3atleta

fun main() {
    val bolt = Atleta("Bolt", 10, 50)
    val maurren = Atleta("Maurren", 5, 40)
    val prova1 = Prova(10, 10)
    val prova2 = Prova(20, 100)
    val prova3 = Prova(5, 5)

    println(prova1.podeRealizar(bolt))
    println(prova2.podeRealizar(bolt))
    println(prova3.podeRealizar(bolt))
    println(prova1.podeRealizar(maurren))
    println(prova2.podeRealizar(maurren))
    println(prova3.podeRealizar(maurren))
}