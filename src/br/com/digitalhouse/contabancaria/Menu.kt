package br.com.digitalhouse.contabancaria

class Menu {

    private val banco = Banco()

    fun exibirMenu(){
        println("Bem vindo ao banco XX!! Seleciona opção no menu abaixo:\n1. Criar conta\n2. Selecionar conta\n" +
                "3. Remover conta\n4. Gerar relatório\n5. Finalizar")
    }

    fun criarConta(){
        var tipoConta = informeTipoConta()
        var nomeCliente = informaNomeCliente()
        if (tipoConta == 1){
            val cp = CP(nomeCliente)
            banco.inserirConta(cp)
        }else{
            val cc = CC(nomeCliente)
            banco.inserirConta(cc)
        }
        println("Conta criada com sucesso")
    }

    fun selecionarConta (){

        var contaSelecionada = contaBancaria(informarConta()!!)
        if(contaSelecionada != null){
          exibeSubMenu(contaSelecionada)
       }else{
           println("Conta Inexistente")
       }
    }

    private fun exibeSubMenu(conta: ContaBancaria){
        println("1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Gerar relatório\n5 - Retornar ao menu anterior")
        val op = readLine()?.toInt()


        when(op){
            1 -> conta.depositar(informeValor()!!)
            2 -> conta.sacar(informeValor()!!)
            3 -> conta.transferir(informeValor()!!, informeConta())
            4 -> conta.mostrarDados()
            5 -> exibirMenu()
            else -> "opção inválida"
        }
    }

    fun removerConta (){
        var contaSelecionada = contaBancaria(informarConta()!!)
        if(contaSelecionada != null){
            banco.removerConta(contaSelecionada)
        }else{
            println("Conta Inexistente")
        }
    }

    fun gerarRelatorio(){
        println("Relatórios:")
        banco.mostrarDados()
    }

    fun finalizar(){
        println("Obrigado por utilizar o banco XX")
    }

    private fun informeValor(): Double? {
        println("Informe um valor:")
        return readLine()?.toDouble()
    }

    private fun informeConta(): ContaBancaria{
        println("Informe uma conta:")
        var numConta = readLine()?.toInt()
        var conta = contaBancaria(numConta!!)
        while (conta == null){
            println("Informa número de conta válido")
            var numConta = readLine()?.toInt()
        }
        return conta
    }

    private fun contaBancaria(numConta: Int) = banco.procurarConta(numConta)

    private fun informeTipoConta(): Int? {
        println("Informe 1 para conta poupança ou 2 para conta corrente:")
        var tipoConta = readLine()?.toInt()
        return tipoConta
    }

    private fun informarConta() : Int?{
        println("Informe o número da conta:")
        var numConta = readLine()?.toInt()
        return  numConta
    }

    private fun informaNomeCliente(): String {
        println("Digite seu nome:")
        var nomeCliente = readLine().toString()
        return nomeCliente
    }

}
