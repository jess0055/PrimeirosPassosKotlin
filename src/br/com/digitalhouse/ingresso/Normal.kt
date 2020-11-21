package br.com.digitalhouse.ingresso

class Normal(override var valor: Double) : Ingresso (){
    override var tipo = "Ingresso Normal"

    override fun imprimeTipo(){
        println (tipo)
    }

    override fun imprimeValor(){
        println (valor)
    }

}