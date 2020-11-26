package br.com.digitalhouse.aula14

class Fornecedor {

    private val listaProdutos = mutableListOf<Produto>()

    fun entrar (desc: String = "", preco: Double=0.0){

        val produto: Produto

        if(desc.isEmpty()){
           produto = Produto(preco = preco)
        }else{
            produto = Produto(preco = preco, descricao = desc)
        }
        listaProdutos.add(produto)
    }

    fun listarProdutos(imprimir : (lista: List<Produto>) -> Unit){
        for (produto in listaProdutos){
            println(produto)//como está como data class imprime atributos
        }
    }
}