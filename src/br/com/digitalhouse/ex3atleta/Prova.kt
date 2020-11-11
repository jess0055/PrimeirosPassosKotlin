package br.com.digitalhouse.ex3atleta

import br.com.digitalhouse.ex3atleta.Atleta

class Prova (var dificuldade: Int, var energiaNecessaria: Int){

    fun podeRealizar (atleta: Atleta) = (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)

}