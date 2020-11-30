package br.com.digitalhouse.banco

class ContaCorrente (var limiteChequeEspecial: Double, saldo: Double, cliente: Cliente ) : Conta (saldo, cliente){


    override fun sacarDinheiro (valor: Double) {
        if (valor <= saldo){
            saldo -= valor
            println("Saque de $valor realizado com sucesso. Saldo atual: $saldo")
        }else{
            println("Saldo insuficiente")
            usarChequeEspecial(valor)
        }
    }

    fun depositarCheque (cheque: Cheque){
        saldo += cheque.valor
        println("Depósito de cheque no valor de ${cheque.valor} realizado com sucesso. Saldo atual: $saldo")
    }

    private fun usarChequeEspecial(valor: Double){
        if (valor <= limiteChequeEspecial) {
            var qtdUsoLimite = valor - saldo
            limiteChequeEspecial -= qtdUsoLimite
            saldo = 0.0
            println("Limite de $qtdUsoLimite utlizado. Limite atual $limiteChequeEspecial, Saldo atual: $saldo")
        }else{
            println("Não há limite suficiente para saque. Limite atual $limiteChequeEspecial")
        }
    }
}