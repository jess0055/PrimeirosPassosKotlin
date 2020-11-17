package br.com.digitalhouse.imprimir

class Documento(override var nome: String) : Imprimivel {
    override var tipoDocumento: String = "documento"

    override fun imprimir() {
        println("$nome do tipo $tipoDocumento")
    }
}