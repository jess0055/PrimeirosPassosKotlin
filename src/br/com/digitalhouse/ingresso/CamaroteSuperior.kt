package br.com.digitalhouse.ingresso

class CamaroteSuperior (var valorAdicionalCamarote: Double, override var valorAdicionalVip: Double, valor: Double) : Vip(valor){

    override var tipo = "Camarote Superior"

    override fun valorIngresso() : Double {
        return  valor + valorAdicionalVip + valorAdicionalCamarote
    }

    override fun imprimeValor() {
        println (valorIngresso())
    }

    override fun imprimeTipo() {
        println (tipo)
    }
}