package br.com.digitalhouse.aula8

interface Saudavel {
    //nao posso inicializar
    val diagnostico: String

    //obrigado a implementar na classe que usa
    fun animalSaudavel(): Boolean

    fun tomarMedicamento(){
        if(animalSaudavel()){
            println("Saudavel")
        }else{
            println("Não está Saudavel")
        }
    }
}