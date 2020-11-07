package br.com.digitalhouse.exercicios

class SessaoDeTreinamento (){

    fun treinarA (jogador: JogadorDeFutebol){

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("A experiência do jogador ${jogador.nome} é ${jogador.experiencia}")
        jogador.experiencia++
        println("A experiência do jogador ${jogador.nome} é ${jogador.experiencia}")

    }
}