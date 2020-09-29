package kotlin2

class CalculadoraBonificacao {
   var calculo = 0.0
      private set

   fun calcula(valor: Double): Double {
      calculo += valor
      return calculo
   }
}