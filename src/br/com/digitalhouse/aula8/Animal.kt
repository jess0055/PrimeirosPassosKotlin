package br.com.digitalhouse.aula8

abstract class Animal (val nome: String, open val raca: String) {
    abstract  val tipo: String
    abstract fun andar()

    open fun respirar(){
        println("$tipo respira")
        //respPrivate ()
    }

    private fun respPrivate (){}

    protected fun respProtec (){}
}