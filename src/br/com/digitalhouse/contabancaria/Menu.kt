package br.com.digitalhouse.contabancaria

class Menu {

    private val banco = Banco()

    fun exibirMenu(){
        println("Bem vindo ao banco XX!! Seleciona opção no menu abaixo:\n1. Criar conta\n2. Selecionar conta\n" +
                "3. Remover conta\n4. Gerar relatório\n5. Finalizar")
    }

    fun criarConta(tipoConta: Int, numConta:Int, saldo: Double){
        if (tipoConta == 1){
            val cp = CP(numConta, 100.00)
            banco.inserirConta(cp)
        }else{
            val cc = CC(numConta, 100.00)
            banco.inserirConta(cc)
        }
        println("Conta criada com sucesso")
    }

    fun selecionarConta (numConta:Int){
        if(verificaExiste(numConta)){
          exibeSubMenu(banco.procurarConta(numConta)!!)
       }else{
           println("Conta Inexistente")
       }
    }

    private fun exibeSubMenu(conta: ContaBancaria){
        println("1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Gerar relatório\n5 - Retornar ao menu anterior")
        val op = readLine()!!.toInt()
        when(op){
            1 -> conta.depositar(informeValor())
            2 -> conta.sacar(informeValor())
            3 -> conta!!.transferir(informeValor(), informeConta())
            4 -> conta.mostrarDados()
            5 -> exibirMenu()
        }
    }

    fun removerConta (numConta:Int){
        if(verificaExiste(numConta)){
            banco.removerConta(banco.procurarConta(numConta)!!)
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

    private fun informeValor(): Double{
        println("Informe um valor:")
        return readLine()!!.toDouble()
    }

    private fun informeConta(): ContaBancaria{
        println("Informe uma conta:")
        var conta = readLine()!!.toInt()
        return banco.procurarConta(conta)!!
    }

    private fun verificaExiste(numConta: Int): Boolean{
       return banco.procurarConta(numConta) != null
    }
}