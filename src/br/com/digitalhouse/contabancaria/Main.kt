package br.com.digitalhouse.contabancaria

fun main() {


    val menu = Menu()
    menu.exibirMenu()
    var opcao = readLine()!!.toInt()

    while (opcao != 5){
        when(opcao){
            1 -> {
                println("Informe 1 para conta poupança ou 2 para conta corrente:")
                var tipoConta = readLine()!!.toInt()
                println("Informe o saldo da conta:")
                var saldo: Double = readLine()!!.toDouble()
                menu.criarConta(tipoConta, informarConta(), saldo)
            }
            2 -> menu.selecionarConta(informarConta())
            3 -> menu.removerConta(informarConta())
            4 -> menu.gerarRelatorio()
        }
        menu.exibirMenu()
        opcao = readLine()!!.toInt()
    }
    if (opcao ==5){
        menu.finalizar()
    }
}

fun informarConta() : Int{
    println("Informe o número da conta:")
    var numConta:Int = readLine()!!.toInt()
    return  numConta
}