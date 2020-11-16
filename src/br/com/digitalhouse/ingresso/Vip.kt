package br.com.digitalhouse.ingresso

abstract class Vip(var valorAdicionalVip: Double, valor: Double) : Ingresso(valor) {

    abstract fun valorIngresso() : Double

}