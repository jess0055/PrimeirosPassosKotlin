package br.com.digitalhouse.imprimir

class Impressora  (){

    var listaimprimivel = mutableListOf<Imprimivel>()


    fun adicionaLista(imprimivel: Imprimivel) = listaimprimivel.add(imprimivel)


    fun imprimir(){
        for (imprimivel in listaimprimivel){
           imprimivel.imprimir()
        }
    }
}