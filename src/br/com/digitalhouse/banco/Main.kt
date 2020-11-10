package br.com.digitalhouse.banco

fun main() {
    val cliente = Cliente(123, "Oli", 12345, 1234567890)
    val cc = ContaCorrente (10000.00, 500.00, cliente)
    val cp = ContaPoupanca(0.13, 500.00, cliente)
    val cheque = Cheque(150.00, "itau", "09/11/2020")

//validado saque conta corrente
    cc.sacarDinheiro(100.00)
    cc.sacarDinheiro(10000.00)
    cc.sacarDinheiro(400.00)
    cc.sacarDinheiro(400.00)

//validando deposito cheque
    cc.depositarCheque(cheque)

//validando saque poupança
    cp.sacarDinheiro(10.00)
    cp.sacarDinheiro(100000.00)
    cp.recolherJuros()
}