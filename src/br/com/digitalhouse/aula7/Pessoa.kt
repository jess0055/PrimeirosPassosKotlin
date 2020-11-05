package br.com.digitalhouse.aula7

class Pessoa (val nome :String, val idade :Int) {
    var altura: Double = 0.0

    init {
        println("Meu nome é $nome tenho $idade anos")
    }
    //utilizo os atributos q já tenho e add um atributo a mais
    constructor(nome :String, idade :Int, altura :Double) : this(nome, idade) {
        this.altura = altura
    }

    fun falarNome (){
        println("Meu nome é $nome")
    }

    fun falarAltura (){
        if (altura == 0.0) println ("Não sei")
        else println("Minha altura é $altura")
    }
}