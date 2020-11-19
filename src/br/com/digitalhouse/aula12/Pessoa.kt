package br.com.digitalhouse.aula12

data class Pessoa (var nome: String, var sobrenome: String, val RG: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (RG != other.RG) return false

        return true
    }

/*  se não uso data class, tenho que implementar esses metodos

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (nome != other.nome) return false
        if (sobrenome != other.sobrenome) return false

        return true
    }


    override fun toString(): String {
        return "Pessoa(nome='$nome', sobrenome='$sobrenome')"
    }*/

}