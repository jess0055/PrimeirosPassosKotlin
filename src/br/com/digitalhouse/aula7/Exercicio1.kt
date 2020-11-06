package br.com.digitalhouse.aula7

    fun main (){
        val cliente1 = Cliente("Jessica", "Fernandes")
        val cliente2 = Cliente("Vinicius", "Felipe")
        val conta1 = Conta(cliente1, 123456, 0.0)
        val conta2 = Conta(cliente2, 123456, 0.0)

        conta1.saque(50.00)
        conta1.deposito(100.00)
        conta1.saque(50.00)

        conta2.saque(50.00)
        conta2.deposito(100.00)
        conta2.saque(50.00)
    }

