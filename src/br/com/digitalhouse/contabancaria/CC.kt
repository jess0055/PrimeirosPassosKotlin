package br.com.digitalhouse.contabancaria

data class CC(val nomeCliente: String): ContaBancaria(){

    override val numeroConta: Int = (0..100000).random()
    override var saldo: Double = 0.0
    var taxaDeOperacao: Double = 1.0

    init {
        println("${nomeCliente} sua conta foi criada com sucesso. Número $numeroConta Saldo $saldo Taxa $taxaDeOperacao")
    }

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