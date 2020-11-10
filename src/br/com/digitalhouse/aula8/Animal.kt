package br.com.digitalhouse.aula8

open class Animal (val nome: String, open val raca: String) {

    fun andar(){}

    open fun respirar(){
        respPrivate ()
    }

    private fun respPrivate (){}

    protected fun respProtec (){}
}