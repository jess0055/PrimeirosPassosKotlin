package br.com.digitalhouse.aula17

fun main() {

    try {
        val list = listOf<Int>(1,2,3)
        println(list.get(3))
    }catch (ex : Exception){
       // println("erro")
    }

    val n1 = 10
    val n2 = 0
    try {
        val n3 = n1/n2
    }catch (ex : ArithmeticException){
        println(ex.cause)
        println(ex.message)
    }

}