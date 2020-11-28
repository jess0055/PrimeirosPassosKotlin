package br.com.digitalhouse.aula16

import br.com.digitalhouse.aula12.Pessoa
import java.security.KeyStore


fun main() {


    val jes = Pessoa("jss", "fer", 555)
    val jes2 = Pessoa("jss", "fer", 555)

    println(jes == jes2)
    jes.nome = "jessica"
    println(jes == jes2)

    val num = mutableListOf(1,2,3,4,5)
    println(num)
    num.add(0, 10)
    println(num)
    num.removeAt(2)
    println(num)

    num.toList()

    val setNum = setOf(1,1,3,4)
    val setNumBack = setOf(4,3,2,1)

    println(setNum == setNumBack)
    println(setNum.size)
    println(setNumBack.size)

    val map = mapOf<Int, Pessoa>(1 to Pessoa("jess", "fer", 123))
    val map2 = mutableMapOf<Int, Pessoa>(1 to Pessoa("jess", "fer", 123))

    map2.put(2, jes)

    println(map[1])
    println(map2[2])



}