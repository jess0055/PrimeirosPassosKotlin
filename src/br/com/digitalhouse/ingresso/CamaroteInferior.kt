package br.com.digitalhouse.ingresso

class CamaroteInferior(override var valorAdicionalVip: Double, valor: Double) : Vip(valor) {

    override var tipo = "Camarote Inferior"

    override fun valorIngresso(): Double {
        return  valor + valorAdicionalVip
    }

    override fun imprimeValor() {
        println (valorIngresso())
    }

    override fun imprimeTipo() {
        println (tipo)
    }
}