package br.com.digitalhouse.expections

fun main() {


    try {
        val listaStrings = listOf<String>("Pato", "Cachorro", "Gato")
        println(listaStrings.get(3))
    }catch (ex : ArrayIndexOutOfBoundsException){
        println(ex.cause)
        println(ex.message)
        println(ex.printStackTrace())
    }

}