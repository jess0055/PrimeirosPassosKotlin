package br.com.digitalhouse.ingresso

abstract class Ingresso (var valor:Double) {

  abstract  val tipo: String

  open fun imprimeValor(){

  }

}