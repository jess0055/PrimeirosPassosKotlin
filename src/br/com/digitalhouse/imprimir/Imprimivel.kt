package br.com.digitalhouse.imprimir

interface Imprimivel {
    var nome: String
    var tipoDocumento: String
    fun imprimir ()
}