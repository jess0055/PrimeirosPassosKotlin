package br.com.digitalhouse.contabancaria

abstract class ContaBancaria () : Imprimivel {

    abstract val numeroConta: Int
    abstract var saldo: Double
    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)
    abstract fun transferir(valor: Double, contaBancaria: ContaBancaria)
}