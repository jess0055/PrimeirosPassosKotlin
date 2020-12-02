package br.com.digitalhouse.expections

fun main() {

    val calculoMatematico = CalculoMatematico()
   // println(calculoMatematico.divisaoComTryCatch(4,0))
    //println(calculoMatematico.divisaoComTryCatch(4,4))

    try {
        println(calculoMatematico.divisaoSenmTryCatch(4,0))
    }catch (ex : ArithmeticException){
        println(ex.message)
    }
}