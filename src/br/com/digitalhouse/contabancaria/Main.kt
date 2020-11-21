package br.com.digitalhouse.contabancaria

fun main() {

    println("Bem vindo ao banco XX!! No que podemos te ajudar hoje?\nMenu:\n1. Criar conta\n2. Selecionar conta\n" +
            "3. Remover conta\n4. Gerar relatório\n5. Finalizar")
    var op = readLine()?.toInt()

    when(op){
        1-> {
            println("Informe 1 para conta poupança ou 2 para conta corrente:")
            criarConta()
        }
        2-> println("Informe o número da conta:")
        3-> println("Informe o número da conta:")
        4-> println("Relatórios:")
        5-> println("Sessão finalizada.")
    }

}

fun criarConta(){
    var tipoConta = readLine()?.toInt()
    println(tipoConta)
}