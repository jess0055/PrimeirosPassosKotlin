package br.com.digitalhouse.ex2jogador

import br.com.digitalhouse.ex2jogador.JogadorDeFutebol
import br.com.digitalhouse.ex2jogador.SessaoDeTreinamento

fun main() {

    //Exercicio

    val neymar = JogadorDeFutebol("Neymar", 20, 50, 20, 30)
    val messi = JogadorDeFutebol("Messi", 20, 10, 200, 50)
    val treino = SessaoDeTreinamento()

    treino.treinarA(neymar)
    treino.treinarA(messi)
}