package kotlin2

class SistemaLogin {

   fun entra(autenticavel: Autenticavel, senha: String) {
      if(autenticavel.autentica(senha)) {
         println("Você acessou o sistem do Bytebank!")
      } else {
         println("Falha na autenticação")
      }
   }

}