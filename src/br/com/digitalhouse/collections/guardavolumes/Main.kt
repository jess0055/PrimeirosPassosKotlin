package br.com.digitalhouse.collections.guardavolumes

fun main() {

    val camiseta1 = Camiseta("teste1", "teste2")
    val camiseta2 = Camiseta("teste3", "teste3")
    val camiseta3 = Camiseta("abacaxi", "500")
    val camiseta4 = Camiseta("abacata", "600")

    val guardaVolumes = GuardaVolumes()

    guardaVolumes.guardarPecas(listOf(camiseta1, camiseta2))
    guardaVolumes.guardarPecas(listOf(camiseta3, camiseta4))

    guardaVolumes.mostrarPecas()
    guardaVolumes.devolverPecas(2)
    guardaVolumes.mostrarPecas(1)

}