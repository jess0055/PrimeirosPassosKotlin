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
}