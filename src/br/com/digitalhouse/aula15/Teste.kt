package br.com.digitalhouse.aula15

import br.com.digitalhouse.contabancaria.ContaBancaria

class Teste {

    fun opcional(contaBancaria: ContaBancaria?){
       contaBancaria?.depositar(100.00) //No value passed for parameter 'valor'

        //usando if não precisa de ?
            if (contaBancaria != null) {
                contaBancaria.depositar(100.00)
            }else{
                println("erro")
            }

        //usando let no lugar do if
        contaBancaria?.let {
            contaBancaria.depositar(100.00)
        } ?: "" //elvis operator

        //executa mesmo se for null
        contaBancaria!!.depositar(100.00) //No value passed for parameter 'valor'
    }
}