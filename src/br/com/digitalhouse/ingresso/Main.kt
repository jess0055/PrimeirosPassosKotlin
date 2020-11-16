package br.com.digitalhouse.ingresso

fun main() {

    println("Digite 1 para normal e 2 para VIP:")
    var vipOUnormal = readLine().toString()

   if (vipOUnormal.equals("1")){
       val normal = Normal(100.00)
       normal.imprimeTipo()
       normal.imprimeValor()
   }else{
       println("Digite 1 para camarote superior ou 2 para camarote inferior:")
       var inferiorOUsuperior = readLine().toString()
       if(inferiorOUsuperior.equals("1")){
           val camaroteSuperior = CamaroteSuperior(100.00, 200.00, 50.00)
           camaroteSuperior.imprimeTipo()
           camaroteSuperior.imprimeValor()
       }else{
           val camaroteInferior = CamaroteInferior(100.00, 200.00)
           camaroteInferior.imprimeTipo()
           camaroteInferior.imprimeValor()
       }

   }
}