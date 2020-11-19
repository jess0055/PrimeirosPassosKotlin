package br.com.digitalhouse.aluno

fun main() {
    val aluno1 = Aluno("jess", 1234)
    val aluno2 = Aluno("Vini", 1235)

    val listaAluno = mutableListOf(aluno1, aluno2)

    val aluno3 = Aluno("teste", 1235)

   println(listaAluno.contains(aluno3))

}