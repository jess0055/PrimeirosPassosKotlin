package br.com.digitalhouse.banco

class ContaPoupanca (var taxaJuros: Double, saldo: Double, cliente: Cliente ) : Conta (saldo, cliente) {

    fun recolherJuros (){

    }
}