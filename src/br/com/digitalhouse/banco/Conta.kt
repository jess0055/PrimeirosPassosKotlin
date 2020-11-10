package br.com.digitalhouse.banco

open class Conta (var saldo: Double = 0.0, val cliente: Cliente) {

    fun depositarDinheiro (valor: Double) {
        if (valor > 0){
            saldo += valor
            println("Depósito de $valor realizado com sucesso. Saldo atual: $saldo")
        }else{
            println("Valor inválido")
        }
    }

    open fun sacarDinheiro (valor: Double) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor
            println("Saque de $valor realizado com sucesso. Saldo atual: $saldo")
        }else{
            println("Valor inválido")
        }
    }

    fun consultarSaldo () : Double{
        return saldo
    }

}