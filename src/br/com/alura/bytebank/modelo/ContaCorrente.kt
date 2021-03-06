package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), Transferivel {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa
            println("Sacando: ${this.saldo} de ${this.titular}")
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor)
            return true
        }
        return false
    }
}