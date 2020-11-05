package br.com.digitalhouse.aula7

import kotlin.random.Random

class Conta (val titular: Cliente, var saldo: Double, val numConta: Int) {

    fun deposito (valorDeposito: Double) {
        saldo+= valorDeposito

        println("Deposito de $valorDeposito realizado com sucesso. Saldo = $saldo")
    }

    fun saque (valorSaque: Double) {

        if (valorSaque > saldo) println("Saldo insuficiente")
        else {
            saldo -= valorSaque
            println("Saque de $valorSaque realizado com sucesso. Saldo = $saldo")
        }
    }
}