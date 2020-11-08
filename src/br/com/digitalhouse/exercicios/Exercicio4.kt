package br.com.digitalhouse.exercicios

fun main() {

    val tripe1 = Tripe (false, 5, 10, 8)

    tripe1.definirAltura(4)
    tripe1.dobrar()
    tripe1.guardar()
    tripe1.definirAltura(5)
    tripe1.guardar()

    tripe1.usar()
    tripe1.desdobrar()
    tripe1.definirAltura(6)
    tripe1.usar()
}