package br.com.digitalhouse.contabancaria

data class CP(val nomeCliente: String): ContaBancaria(){

    override val numeroConta: Int = (0..100000).random()
    override var saldo: Double = 0.0
    var limite: Double = 100.0

    init {
        println("${nomeCliente} sua conta foi criada com sucesso. Número $numeroConta Saldo $saldo Limite $limite")
    }

    override fun mostrarDados() {
        println(this.toString())
    }

    override fun sacar(valor: Double){
        if(valor >= saldo){
            saldo -= valor
            println("Seu saldo é $saldo")
        }else{
            if (valor <= limite){
                usarLimite(valor)
            }else{
                println("saldo e limite insufcientes")
            }
        }
    }

    private fun usarLimite(valor: Double){
        var limiteUsado = saldo - valor
        var usoSaldo = valor - limiteUsado
        limite -= limiteUsado
        saldo -= usoSaldo

        println("Saldo; $saldo. Limite atual: $limite")

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