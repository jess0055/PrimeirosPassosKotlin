package br.com.digitalhouse.funcionario

import br.com.digitalhouse.aluno.Aluno

class Funcionario ( val nome: String, val numeroDeRegistro: Int){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroDeRegistro != other.numeroDeRegistro) return false

        return true
    }
}