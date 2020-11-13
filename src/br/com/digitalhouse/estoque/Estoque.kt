package br.com.digitalhouse.estoque

class Estoque (var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    init {
        if (qtdAtual < 0) qtdAtual = 0
        if (qtdMinima < 0) qtdMinima = 0
    }

    fun mudarNome(nome: String){
        this.nome = nome
    }
    fun mudarQtdMinima(qtdMinima: Int){
        this.qtdMinima = qtdMinima
    }
    fun repor(qtd: Int){
        qtdAtual += qtd
        println("$qtd adicionados. Quantidade atual: $qtdAtual")
    }
    fun darBaixa(qtd: Int){
        if(qtd <= qtdAtual){
            qtdAtual -= qtd
            println("$qtd retirados. Quantidade atual: $qtdAtual")
        }else{
            println("Não há estoque do produto")
        }

    }
    fun mostra()  = "O produto $nome tem quantidade minima de $qtdMinima e a quantidade atual é $qtdAtual"
    fun precisaRepor() = qtdAtual <= qtdMinima

}
