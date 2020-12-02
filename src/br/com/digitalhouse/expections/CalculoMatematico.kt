package br.com.digitalhouse.expections

class CalculoMatematico {

    fun divisaoComTryCatch(num1: Int, num2: Int) : Int{
        var resultado = 0
        try {
            resultado = num1/num2
        }catch (ex : ArithmeticException){
            println("operação não pode ser realizada")
        }
        return resultado
    }

    fun divisaoSenmTryCatch(num1: Int, num2: Int) : Int  {

       if(num2 == 0){
           throw  ArithmeticException("Divisão não pode ser por zero")
       }else{
           return num1 / num2
       }
    }
}