package br.com.digitalhouse.aluno

data class Aluno ( val nome: String, val numeroDeAluno: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numeroDeAluno != other.numeroDeAluno) return false

        return true
    }

}