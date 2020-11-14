package br.com.digitalhouse.ingresso

open class Vip(var valorAdicional: Double, valor: Double) : Ingresso(valor) {
    override val tipo = "Ingresso Normal"


    fun valorIngresso() : Double {
        return  valor + valorAdicional
    }

    fun imprimeLocalizacao(){

    }
}