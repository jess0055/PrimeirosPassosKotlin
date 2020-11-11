package br.com.digitalhouse.ex4tripe

class Tripe ( var dobrado: Boolean = true, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {

    fun definirAltura(novaAltura: Int) {
        alturaAtual = novaAltura
        println("Nova altura = $alturaAtual")
    }

    fun dobrar(){
        dobrado = true
        println("Tripe dobrado")
    }

    fun desdobrar(){
        dobrado = false
        println("Tripe desdobrado")
    }

    fun guardar() {
        if(prontoParaGuardar()){
            println("Tripe guardado")
        }
        else{
            println("Dobre seu tripe diminua a altura para poder guardar")
        }
    }

    private fun prontoParaGuardar() : Boolean{
        return (dobrado && alturaAtual == alturaMinima)
    }

    fun usar(){
        if(prontoParaUsar()){
            println("Tripe usado")
        }
        else{
            println("Desdobre seu tripe aumete a altura para poder usar")
        }
    }

    private fun  prontoParaUsar() : Boolean{
        return (!dobrado && (alturaAtual > alturaMaxima/2))
    }
}