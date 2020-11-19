package br.com.digitalhouse.imprimir

fun main() {

    val foto = Foto("teste")
    val documento = Documento("doc")
    val contrato = Contrato("doc")
    val impressora = Impressora()
    impressora.adicionaLista(foto)
    impressora.adicionaLista(documento)
    impressora.adicionaLista(contrato)
    impressora.imprimir()
   // foto.imprimir()

}