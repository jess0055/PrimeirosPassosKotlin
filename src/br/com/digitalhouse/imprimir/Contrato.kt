package br.com.digitalhouse.imprimir

class Contrato(override var nome: String) : Imprimivel {
    override var tipoDocumento = "contrato"

    override fun imprimir() {
        println("$nome do tipo $tipoDocumento")
    }
}