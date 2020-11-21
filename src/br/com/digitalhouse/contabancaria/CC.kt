package br.com.digitalhouse.contabancaria

data class CC(var taxaDeOperacao: Double, override val numeroConta: Int, override var saldo: Double): ContaBancaria(){

    override fun mostrarDados() {
       println(this.toString())
    }

    override fun sacar(valor: Double){
        if (saldo>0){
            saldo-=taxaDeOperacao
            saldo-=valor
        }else{
            println("Saldo insuficiente")
        }

    }
    override fun depositar(valor: Double){
        if (saldo>0) {
            saldo -= taxaDeOperacao
            saldo += valor
            println("Seu saldo é $saldo")
        }else{
            println("Saldo insuficiente")
        }
    }

    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        this.sacar(valor)
        contaBancaria.depositar(valor)
    }
}