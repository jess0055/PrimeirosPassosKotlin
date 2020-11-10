package br.com.digitalhouse.aula8

class Cachorro (raca: String, nome: String) : Animal (nome, raca) {

    override val raca = "pit"

    fun latir(){}

   override fun respirar(){
       print("dog respira")
       super.respirar()
       super.respProtec()
       //super.respPrivate() não deixa pq private só a propria classe pode usar
   }
}