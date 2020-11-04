package br.com.digitalhouse

fun main() {
    //println(mairNumero(5,8,4))
    //println(comparaTexto("jessica", "jess"))
    //println(par(4))
    //imprimeCemImpares()
    //println(analisaInteiros(2,5,6,8))
    //imprimeCemPositivos()
}

//1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
fun mairNumero (n1: Int, n2: Int, n3: Int) :Int {
    return maxOf(n1, n2, n3)
}

//2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
fun comparaTexto (texto1: String, texto2: String) :Boolean {
    return texto1.equals(texto2)
}

//3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
fun par (num: Int) :Boolean{
    return num%2==0
}

//4) Escrever um programa que imprima na tela os primeiros 100 números
//inteiros positivos ímpares.
fun imprimeCemImpares (){
    for(num in 1..200 step 2){
        println(num)
    }
}

//5) Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD,
//retornar true, caso contrário, retornar false.
fun analisaInteiros (numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
  return maxOf(numA, numB, numC) == numA || maxOf(numB, numC, numD) == numB
}

//6) Escrever um programa que exiba os primeiros 100 números positivos.
fun imprimeCemPositivos(){
    for(num in 1..100){
        println(num)
    }
}