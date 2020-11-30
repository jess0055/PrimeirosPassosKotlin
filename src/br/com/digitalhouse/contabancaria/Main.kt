package br.com.digitalhouse.contabancaria

fun main() {

    val menu = Menu()
    menu.exibirMenu()
    var opcao = readLine()?.toInt()

        while (opcao != 5){
            when(opcao){
                1 -> menu.criarConta()
                2 -> menu.selecionarConta()
                3 -> menu.removerConta()
                4 -> menu.gerarRelatorio()
                else ->  println("Digite um valor válido")
            }
            menu.exibirMenu()
            opcao = readLine()?.toInt()
        }
        menu.finalizar()
    }


