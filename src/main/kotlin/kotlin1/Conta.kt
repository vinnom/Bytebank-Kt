package kotlin1

class Conta(var titular: String, val numero: Int) {
   var saldo: Double = 0.0
      private set

   fun deposita(valor: Double): Boolean {
      if(valor > 0) {
         this.saldo += valor
         return true
      }
      return false
   }

   fun saca(valor: Double): Boolean {
      if(valor > 0 && valor <= this.saldo) {
         this.saldo -= valor
         return true
      }
      return false
   }

   fun transfere(valor: Double, conta: Conta): Boolean {
      if(this.saca(valor)) {
         conta.deposita(valor)
         return true
      }
      return false
   }
}