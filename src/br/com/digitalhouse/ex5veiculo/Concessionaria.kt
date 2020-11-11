package br.com.digitalhouse.ex5veiculo

class Concessionaria {
    val vendas = ArrayList<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double){
        var venda = Venda(valor, veiculo, cliente)
        vendas.add(venda)
        println("Venda registrada com sucesso")
    }
}