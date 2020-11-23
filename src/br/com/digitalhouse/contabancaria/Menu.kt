package br.com.digitalhouse.contabancaria

class Menu {

    private val banco = Banco();

    fun exibirMenu(){
        println("Bem vindo ao banco XX!! Seleciona opção no menu abaixo:\n1. Criar conta\n2. Selecionar conta\n" +
                "3. Remover conta\n4. Gerar relatório\n5. Finalizar")
    }

    fun criarConta(tipoConta: Int, numConta:Int, saldo: Double){
        if (tipoConta == 1){
            val cp = CP(numConta, 100.00)
            banco.inserirConta(cp)
            println("Conta criada com sucesso")
        }else{
            val cc = CC(numConta, 100.00)
            banco.inserirConta(cc)
            println("Conta criada com sucesso")
        }
    }

    fun selecionarConta (numConta:Int){
        var conta = banco.procurarConta(numConta)
        if(conta != null){
          exibeSubMenu(conta)
       }else{
           println("Conta Inexistente")
       }
    }

    private fun exibeSubMenu(conta: ContaBancaria){
        println("1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Gerar relatório\n5 - Retornar ao menu anterior")
        var op = readLine()!!.toInt()
        when(op){
            1 -> {
                println("Informe o valor para deposito:")
                var valorDeposito: Double = readLine()!!.toDouble()
                conta.depositar(valorDeposito)
            }
            2 -> {
                println("Informe o valor para saque:")
                var valorSaque: Double = readLine()!!.toDouble()
                conta.sacar(valorSaque)
            }
            3 -> {
                println("Informe o valor para transferencia:")
                var valorTransferencia: Double = readLine()!!.toDouble()
                println("Informe o numero conta para transferir:")
                var numConta: Int = readLine()!!.toInt()
                if(banco.procurarConta(numConta) != null){
                    var conta = banco.procurarConta(numConta)
                    conta!!.transferir(valorTransferencia, conta!!)
                }

            }
            4 -> conta.mostrarDados()
            5 -> exibirMenu()
        }
    }

    fun removerConta (numConta:Int){
        var conta = banco.procurarConta(numConta)
        if(conta != null){
            banco.removerConta(conta)
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


}