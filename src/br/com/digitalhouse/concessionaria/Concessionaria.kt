package br.com.digitalhouse.concessionaria

class Concessionaria {

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double){
        var venda = Venda(valor, veiculo, cliente)
        println("Venda registrada com sucesso")
    }
}