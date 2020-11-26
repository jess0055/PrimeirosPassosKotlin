package br.com.digitalhouse.livraria

data class Livro (val codigo: Int, val titulo: String, val autor: String, val anoDeLancamento: Int, val codigoISBN: Long,
             var qtdeEstoque: Int, var preco: Double)

