package br.com.digitalhouse.exercicios

fun main() {

    //Exercicio

    val neymar = JogadorDeFutebol("Neymar", 20, 50, 20, 30)
    val messi = JogadorDeFutebol("Messi", 20, 10, 200, 50)
    val treino = SessaoDeTreinamento()

    treino.treinarA(neymar)
    treino.treinarA(messi)
}