package br.com.digitalhouse.contabancaria

data class CP(var limite: Double, override val numeroConta: Int, override var saldo: Double): ContaBancaria(){
    override fun mostrarDados() {
        println(this.toString())
    }

    override fun sacar(valor: Double){
        if(saldo+limite >= valor){
            usarLimite(valor)
            saldo -= valor
            println("Seu saldo é $saldo")
        }else{
            println("saldo insufciente")
        }
    }
    private fun usarLimite(valor: Double){
        limite = (saldo - valor) + limite
    }
    override fun depositar(valor: Double){
        saldo += valor
        println("Seu saldo é $saldo")
    }

    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        this.sacar(valor)
        contaBancaria.depositar(valor)
    }
}