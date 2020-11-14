package br.com.digitalhouse.banco

import kotlin.math.floor
import kotlin.math.round
import kotlin.math.roundToLong

class ContaPoupanca (var taxaJuros: Double, saldo: Double, cliente: Cliente ) : Conta (saldo, cliente) {

    fun recolherJuros (){
        if (saldo > 0) {
            var aux = saldo * (taxaJuros / 100)
            saldo += aux
            println("Juros de $aux recolhidos. Saldo atual: $saldo")
        }else{
            println("Não há juros para recolhimento")
        }
    }

    override fun sacarDinheiro (valor: Double) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor
            println("Saque de $valor realizado com sucesso. Saldo atual: $saldo")
        }else{
            println("Valor inválido")
        }
    }
}