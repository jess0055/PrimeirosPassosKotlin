package br.com.digitalhouse.ingresso

abstract class Vip(override var valor: Double) : Ingresso() {
    abstract var valorAdicionalVip: Double
    abstract fun valorIngresso() : Double

}