package br.com.digitalhouse.aula14

fun main() {
    //lambda
    val sum : (Int, Int) -> Int = {x, y -> x + y}
    var soma = sum(1,2)
    println(soma)

    val sum2 =  {x: Int, y: Int -> x + y}
    var soma2 = sum2(5,2)
    println(soma2)

    //exercicio

    val fornecedor = Fornecedor()

    fornecedor.entrar(preco = 10.00, desc = "coca")
    fornecedor.entrar(preco = 5.0)

    fornecedor.listarProdutos{
        it.forEach{
            println(it)
        }
    }

    fornecedor.listarProdutos{
        it.forEach{produto ->
            println(produto)
        }
    }

    fornecedor.listarProdutos{listaProd ->
        listaProd.forEachIndexed { index, produto ->
            println(produto)
        }

    }

    fornecedor.listarProdutos{listaProd ->
        for(produto in listaProd){
            println(produto)
        }
    }
}