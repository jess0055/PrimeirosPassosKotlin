package br.com.digitalhouse

fun main(){ //main+enter
    val frase = "teste"
    println(frase)

    var n1 = 4
    var n2 = 5

    when {
        n1>n2 -> {
            println("é maior")
        }
        else -> {
            println("não é maior")
        }
    }

    for (num in 1..n1){
        println("contador $num")
    }

    var x = 2
    while (x>0){
        println(x)
        x--
    }
    println(meuNome("Jessica", "Fernandes"))

}

fun meuNome (nome: String, sobrenome: String) :String {
    return nome + sobrenome
}