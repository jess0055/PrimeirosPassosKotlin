package br.com.digitalhouse.ingresso

class Normal(valor: Double) : Ingresso (valor){
    override var tipo = "Ingresso Normal"

    override fun imprimeTipo(){
        println (tipo)
    }

    override fun imprimeValor(){
        println (valor)
    }

}