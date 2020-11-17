package br.com.digitalhouse.aula8

fun main() {

    val cachorro: Saudavel = object : Saudavel{
        override val diagnostico = "teste"
        override fun animalSaudavel(): Boolean {
           return true
        }

    }
    val dog = Cachorro("srd", "Bidu")
    val cat = Gato("srd", "mel")

    dog.respirar()
    //dog.respProtec() não deixa pq só quem é filho pode usar protected
    //dog.respPrivate() não deixa pq private só a propria classe pode usar

    //polimorfismo
    executar(dog)
    executar(cat)

    //polimorfismo com interface
    tomarMedicamento(dog)
}

fun executar(animal: Animal){
    //polimofismo
    animal.andar()
}

fun tomarMedicamento(animal: Saudavel){
    animal.tomarMedicamento()
}