package br.com.digitalhouse.banco

class ContaCorrente (var limiteChequeEspecial: Double, saldo: Double, cliente: Cliente ) : Conta (saldo, cliente){


    override fun sacarDinheiro (valor: Double) {
        if(valor > saldo && valor <= limiteChequeEspecial){
            var aux = valor - saldo
            limiteChequeEspecial -= aux
            println("Saque de ${aux + saldo} realizado. Você utilizou $aux do cheque especial. Limite atual $limiteChequeEspecial")
            saldo = 0.0
        }else{
            super.sacarDinheiro(valor)
        }
    }

    fun depositarCheque (cheque: Cheque){
        saldo += cheque.valor
        println("Depósito de cheque no valor de ${cheque.valor} realizado com sucesso. Saldo atual: $saldo")
    }
}