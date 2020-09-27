fun testaComportamentosConta() {
   val c1 = Conta(titular = "teste1", numero = 1)
   val c2 = Conta(titular = "teste2", numero = 2)

   // teste deposito negativo
   println(c1.deposita(-200.0)) // false
   println()

   // testes depositos positivos
   println(c1.deposita(200.0)) // true
   println(c2.deposita(300.0)) // true
   println()

   // teste saque negativo
   println(c1.saca(-100.0)) // false
   println()

   // teste saque acima do valor permitido
   println(c2.saca(400.0)) // false
   println()

   // testes saques corretos
   println(c1.saca(10.0)) // true
   println(c2.saca(50.0)) // true
   println()

   // teste transferência erro
   println(c1.transfere(valor = 400.0, conta = c2)) // false
   println()

   // teste transferência passa
   println(c2.transfere(valor = 100.0, conta = c1)) // true
   println()
}