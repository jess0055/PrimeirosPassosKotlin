package br.com.digitalhouse.imprimir

class Foto(override var nome: String) : Imprimivel {
    override var tipoDocumento = "foto"

    override fun imprimir() {
       println("$nome do tipo $tipoDocumento")
    }
}