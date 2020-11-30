package br.com.digitalhouse.livraria

class Estoque() {

    private val listaLivros = mutableListOf<Livro>()

    fun cadastrarLivro(livro: Livro){
        listaLivros.add(livro)
    }

    fun consultarLivro(codigo: Int){
        for (livro in listaLivros){
            if (livro.codigo == codigo){
                println(livro.toString())
            }
            else{
                println("Livro não encontrado")
            }
        }
    }

    fun efetuarVenda(codigo: Int, quantidade: Int){
        for (livro in listaLivros){
            if (verificaQtdDisponivel(livro, quantidade)){
                livro.qtdeEstoque -= quantidade
            }
            else{
                println("Quantidade não disponível")
            }
        }
    }

    private fun verificaQtdDisponivel(livro: Livro, quantidade: Int) = livro.qtdeEstoque <= quantidade

}