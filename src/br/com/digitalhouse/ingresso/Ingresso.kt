package br.com.digitalhouse.ingresso

abstract class Ingresso () {

  abstract var valor:Double
  abstract var tipo : String

  abstract fun imprimeValor()

  abstract fun imprimeTipo()
}