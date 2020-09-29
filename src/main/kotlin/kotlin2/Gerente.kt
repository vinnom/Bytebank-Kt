package kotlin2

class Gerente(nome: String, cpf: String, salario: Double, senha: String)
   : FuncionarioAutenticavel(nome, cpf, salario, senha) {

   override fun bonificacao(): Double {
      return salario * 0.10 + 100.0
   }
}