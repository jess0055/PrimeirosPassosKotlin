package br.com.digitalhouse.loja

fun main() {
    val item = Item (1, "pc", 2, 2.0)
    val item2 = Item (1, "pc", 2, 2.0)

    val listaItens = arrayListOf<Item>(item, item2)

    val fatura = Fatura(listaItens)
    println(fatura.totalDaFatura())
}