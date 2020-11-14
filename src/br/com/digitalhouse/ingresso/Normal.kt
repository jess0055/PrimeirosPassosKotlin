package br.com.digitalhouse.ingresso

class Normal(valor: Double) : Ingresso (valor){

    override val tipo = "Ingresso Normal"


    fun imprimeTipo(){
        println(tipo)
    }


}