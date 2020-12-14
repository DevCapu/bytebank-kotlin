package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("Bem vindo ao ByteBank")
        } else {
            println("Senha incorreta")
        }
    }
}