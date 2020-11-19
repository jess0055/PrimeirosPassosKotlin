package br.com.digitalhouse.funcionario

fun main() {
    val funcionario1 = Funcionario("jess", 1234)
    val funcionario2 = Funcionario("Vini", 1235)

    val listaFuncionario = mutableListOf(funcionario1, funcionario2)

    val funcionario3 = Funcionario("teste", 1235)

    println(listaFuncionario.contains(funcionario3))
}