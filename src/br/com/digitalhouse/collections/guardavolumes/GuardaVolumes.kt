package br.com.digitalhouse.collections.guardavolumes

class GuardaVolumes()  {

    private val mapPecas =  mutableMapOf<Int, List<Peca>>()
    private var contador: Int = 1

    fun guardarPecas(listaPecas: List<Peca>){
        mapPecas.put(contador, listaPecas)
        println("Peças guardadadas com sucesso. Identificação: $contador")
        contador ++
    }

    fun mostrarPecas(){
        mapPecas.forEach{peca->
            println(peca)
        }
    }

    fun mostrarPecas(numero: Int){
        if (mapPecas.containsKey(numero)){
            println(mapPecas[numero])
        }else{
            println("Peça não encontrada")
        }
    }

    fun devolverPecas(numero: Int) {
        if (mapPecas.containsKey(numero)){
            mapPecas.remove(numero)
            println("Peça devolvida com sucesso")
        }else{
            println("Peça não encontrada")
        }
    }

}