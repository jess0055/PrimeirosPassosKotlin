package br.com.digitalhouse.banco

open class Conta (var saldo: Double = 0.0, val cliente: Cliente) {

    fun depositar (valor: Double) {
        if (valor > 0){
            saldo += valor
        }
    }

    open fun sacarDinheiro (valor: Double) {
        if (valor > 0 && saldo > 0){
            saldo -= valor
        }
    }

    fun consultarSaldo (valor: Double) : Double{
        return saldo
    }

}