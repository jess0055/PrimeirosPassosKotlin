package br.com.digitalhouse.exercicios.aula7

fun main() {

    val pessoa1 = Pessoa ("jessica", 25, 1.72)
    val pessoa2 = Pessoa ("jessica", 25)

    println("${pessoa1.nome} ${pessoa1.idade}") // só posso acessar propriedade se tiver declarado como val na classe/construtor

    pessoa1.falarNome()
    pessoa1.falarAltura()
    pessoa2.falarAltura()
}