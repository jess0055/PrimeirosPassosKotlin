package br.com.digitalhouse.cadastroalunos

class Professor (val nome: String, val rd: Int) {

    fun darAula (aula: Aula){
        println("O professor $nome está dando aula de ${aula.materia.nome}")
    }
    fun fazerChamada(aula: Aula, turma: Turma){
        println("O professor $nome fazedo a chamada da aula de ${aula.materia.nome} da ${turma.nome} do curso de ${turma.curso.nome}")
    }
}