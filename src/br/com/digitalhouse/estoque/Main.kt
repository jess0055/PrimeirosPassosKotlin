package br.com.digitalhouse.estoque

fun main() {

    val estoque = Estoque("Mouse", 10, 5)
    println(estoque.mostra())
    estoque.mudarNome("teclado")
    estoque.mudarQtdMinima(3)
    estoque.repor(5)
    estoque.darBaixa(18)
    println(estoque.precisaRepor())
    println(estoque.mostra())
}