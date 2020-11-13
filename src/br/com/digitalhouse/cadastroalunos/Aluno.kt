package br.com.digitalhouse.cadastroalunos

class Aluno (val ra: Int, val nome: String, val sobrenome: String) {

    fun assistirAula(aula: Aula){
        println("O aluno $nome está assistindo a aula de ${aula.materia.nome}")
    }
    fun fazerLicao(aula: Aula){
        println("O aluno $nome está fazendo a lição da aula de ${aula.materia.nome}")
    }
}