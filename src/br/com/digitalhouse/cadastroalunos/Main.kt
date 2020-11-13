package br.com.digitalhouse.cadastroalunos

fun main() {

    val materia1 = Materia("heranca")

    val listaAula = ArrayList<Aula>()
    val aula1 = Aula(materia1, "19:30", "21:30")
    val aula2 = Aula(materia1, "19:30", "21:30")
    listaAula.add(aula1)
    listaAula.add(aula2)

    val aluno1 = Aluno(1234, "Junior", "Oli")
    val aluno2 = Aluno(1234, "Junior", "Oli")
    val listaAluno = arrayListOf<Aluno>(aluno1, aluno2)


    val professor1 = Professor("joao", 1234)

    val curso1 = Curso ("Android", listaAula, listaAluno, professor1)
    val turma1 = Turma ("turmaA", curso1)

    professor1.darAula(aula1)
    professor1.fazerChamada(aula1, turma1)

    aluno1.assistirAula(aula2)
    aluno1.fazerLicao(aula2)

}