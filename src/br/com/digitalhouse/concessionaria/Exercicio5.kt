package br.com.digitalhouse.concessionaria

fun main() {

    val veiculo1 = Veiculo("Volkswagen", "Gol", 2010, "Branco", 50)
    val cliente1 = Cliente("jessica", "Oli", 960770780)
    val concessionaria = Concessionaria()
    concessionaria.registrarVenda(veiculo1, cliente1, 10.000)
}
