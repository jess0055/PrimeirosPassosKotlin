package br.com.digitalhouse.exercicios

class Prova (var dificuldade: Int, var energiaNecessaria: Int){

    fun podeRealizar (atleta: Atleta) = (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)

}