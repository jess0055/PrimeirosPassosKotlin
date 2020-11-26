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
            if (livro.qtdeEstoque <= quantidade){
                livro.qtdeEstoque -= quantidade
            }
            else{
                println("Estoque esgotado")
            }
        }
    }

    private fun verificaEstoque(quantidade: Int) : Boolean {
        return true
    }
}