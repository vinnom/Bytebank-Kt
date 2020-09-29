package kotlin2.funcaoTeste

import kotlin2.CalculadoraBonificacao
import kotlin2.Gerente
import kotlin2.Recepcionista
import kotlin2.SistemaLogin

fun testaFuncionariosELogin() {
   val recepcionista = Recepcionista("recepcionista", "111.111.111-11", 1500.0)
   val gerente = Gerente("gerente", "222.222.222-22", 3000.0, "123456")

   val calculadoraBonificacao = CalculadoraBonificacao()
   println(calculadoraBonificacao.calcula(recepcionista.bonificacao()))
   println(calculadoraBonificacao.calcula(gerente.bonificacao()))

   println()
   val sistemaLogin = SistemaLogin()
   sistemaLogin.entra(gerente, "12345")
   sistemaLogin.entra(gerente, "123456")
}