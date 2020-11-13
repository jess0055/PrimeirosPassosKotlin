package br.com.digitalhouse.loja

class Fatura (val itens: ArrayList<Item>){

    fun totalDaFatura() : Double {
        var total  = 0.0

        for (item in itens){
            total += item.qtdItem * item.precoItem
        }
        return  total
    }
}