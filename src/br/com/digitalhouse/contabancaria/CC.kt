package br.com.digitalhouse.contabancaria

data class CC(override val numeroConta: Int, override var saldo: Double): ContaBancaria(){
    var taxaDeOperacao: Double = 0.0

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