package br.com.digitalhouse.ingresso

abstract class Ingresso (var valor:Double) {

  abstract var tipo : String

  abstract fun imprimeValor()

  abstract fun imprimeTipo()
}