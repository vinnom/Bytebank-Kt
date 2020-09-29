package kotlin2

abstract class FuncionarioAutenticavel(nome: String, cpf: String, salario: Double,
                                       protected val senha: String)
   : Funcionario(nome, cpf, salario), Autenticavel {

   override fun autentica(senha: String): Boolean {
      if(senha == this.senha) {
         return true
      }
      return false
   }

}