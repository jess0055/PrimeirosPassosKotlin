package br.com.digitalhouse.exercicio5

class Concessionaria {

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double){
        var venda = Venda(valor, veiculo, cliente)
        println("Venda registrada com sucesso")
    }
}