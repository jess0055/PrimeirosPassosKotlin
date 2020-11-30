package br.com.digitalhouse.collections.guardavolumes

data class Camiseta(override val modelo: String, override val marca: String) : Peca() {

    override fun retirada() {
        //
    }
}