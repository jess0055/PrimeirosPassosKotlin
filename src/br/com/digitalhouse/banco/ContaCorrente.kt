package br.com.digitalhouse.banco

class ContaCorrente (var limiteChequeEspecial: Double, saldo: Double, cliente: Cliente ) : Conta (saldo, cliente){


    override fun sacarDinheiro (valor: Double) {
        if(saldo <=0){
            limiteChequeEspecial -= valor
        }else{
            super.sacarDinheiro(valor)
        }
    }

    fun depositarCheque (cheque: Cheque){

    }
}