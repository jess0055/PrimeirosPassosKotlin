package br.com.digitalhouse.collections.guardavolumes

abstract class Peca() {
    abstract val modelo: String
    abstract val marca: String
    abstract fun retirada()
}