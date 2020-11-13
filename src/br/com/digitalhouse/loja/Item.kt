package br.com.digitalhouse.loja

class Item (val numItem: Int, val descricaoItem: String, var qtdItem: Int, var precoItem: Double) {

    init {
        if (qtdItem < 0) qtdItem = 0
        if (precoItem < 0.0) precoItem = 0.0
    }
}