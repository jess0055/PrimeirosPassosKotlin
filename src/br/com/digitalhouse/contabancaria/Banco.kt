package br.com.digitalhouse.contabancaria

class Banco : Imprimivel{

    var listaContas = ArrayList<ContaBancaria>()

    fun inserirConta (contaBancaria: ContaBancaria)= listaContas.add(contaBancaria)

    fun removerConta (contaBancaria: ContaBancaria) = listaContas.remove(contaBancaria)

    fun procurarConta(numeroConta: Int) : ContaBancaria? {
        for (conta in listaContas){
            if (conta.numeroConta.equals(numeroConta)){
                return  conta
            }
        }
        return  null
    }

    override fun mostrarDados() {
        for (conta in listaContas){
            conta.mostrarDados()
        }
    }
}