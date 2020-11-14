package br.com.digitalhouse.banco

abstract class Conta (protected var saldo: Double = 0.0, val cliente: Cliente) {

    fun depositarDinheiro (valor: Double) {
        if (valor > 0){
            saldo += valor
            println("Depósito de $valor realizado com sucesso. Saldo atual: $saldo")
        }else{
            println("Valor inválido")
        }
    }

    abstract fun sacarDinheiro (valor: Double)

    fun consultarSaldo () : Double{
        return saldo
    }

}