package br.com.digitalhouse

fun main() {

    val meuArray = ArrayList<Int>()
    meuArray.add(1)
    meuArray.add(2)
    meuArray.add(3)
    meuArray.add(6)
    meuArray.add(7)
    meuArray.add(8)

    //exercicio1()
    //println(exercicio2(20, 10))
    //println(exercicio3(11))
    //println(exercicio4(meuArray))
    //println(exercicio5(meuArray))
    //println(exercicio6(meuArray))
}

fun exercicio1 (){
    val umNumeroA = 25
    val umNumeroB = 10.55
    val umaCadeiaDeTexto = "Jessica"

    println("A: $umNumeroA B: $umNumeroB String: $umaCadeiaDeTexto")
    println ("A+B= ${umNumeroA + umNumeroB}")
    println ("A-B= ${umNumeroA - umNumeroB}")

}

//Escrever um programa, que deve analisar dois números inteiros e, se o primeiro número for menor que o segundo número, retornar true, caso contrário, retorna false.
fun exercicio2 (n1: Int, n2: Int) : Boolean{
    return maxOf(n1, n2) == n2
}

//Escrever um programa que deve analisar um número inteiro e, caso ele seja ímpar e maior que dez, retornar true, caso contrário, retornar false.
fun exercicio3(n1: Int) : Boolean{
    return n1%2 !=0 && n1 >10
}

//4. Escrever um programa, que pegue um Array de números e retorne a soma de todos os elementos dele.
fun exercicio4(umArray: ArrayList<Int>) : Int{
    var soma = 0
    for (num in umArray){
        soma +=num
    }
    return soma
}

//5. Escrever um programa que receba um Array e retorne a soma de todos os elementos pares do Array
fun exercicio5(umArray: ArrayList<Int>) : Int{
    var soma = 0
    for (num in umArray){
        if(num%2==0) {
            soma += num
        }
    }
    return soma
}

//6. Escreva um programa que receba um Array de números e retorne um Array com todos os elementos pares dele.
fun exercicio6(umArray: ArrayList<Int>) : ArrayList<Int>{
    var parArray = ArrayList<Int>()
    for (num in umArray){
        if(num%2==0) {
            parArray.add(num)
        }
    }
    return parArray
}