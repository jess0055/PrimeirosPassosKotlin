package br.com.digitalhouse.expections

fun main() {
    
    try {
        val listaStrings = listOf<String>()
        println(listaStrings.get(5))
    }catch (ex : IndexOutOfBoundsException){
        println(ex.message)
    }
}