package br.com.digitalhouse.aula8

class Gato (raca: String, nome: String) : Animal (nome, raca) {
    override val tipo = "Gato"

    override fun andar() {
        println("Anda silencioso")
    }
}