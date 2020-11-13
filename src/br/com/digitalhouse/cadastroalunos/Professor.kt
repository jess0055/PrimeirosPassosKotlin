package br.com.digitalhouse.cadastroalunos

class Professor (val nome: String, val rd: Int) {
    val listachamada = mutableListOf<Aluno>()

    fun darAula (aula: Aula){
        println("O professor $nome está dando aula de ${aula.materia.nome}")
    }
    fun fazerChamada(turma: Turma){
        for (it in turma.curso.alunos) {
            listachamada.add(it)
        }
       imprimirListaChamda()
    }

    private fun imprimirListaChamda(){
        for (aluno in listachamada){
            println("Aluno ${aluno.nome} presente")
        }
    }
}