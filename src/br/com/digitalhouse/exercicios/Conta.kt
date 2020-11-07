package br.com.digitalhouse.exercicios

class Conta(val titular: Cliente, val numConta: Int, var saldo: Double) {

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