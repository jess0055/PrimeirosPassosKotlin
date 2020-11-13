package br.com.digitalhouse.aula8

class Cachorro (raca: String, nome: String) : Animal (nome, raca) {

   //sobrescrita obrigatoria pois são abstratos na classe mae
    override val tipo = "Cachorro"

    override fun andar() {
        println("Anda abanando o rabo")
    }

    //sobrestrica opcional pois são open na classe mae
    override val raca = "pit"

    override fun respirar(){
       print("dog respira")
       super.respirar()
       super.respProtec()
       //super.respPrivate() não deixa pq private só a propria classe pode usar
   }

    fun latir(){}

    fun cavarBuraco(){}
}