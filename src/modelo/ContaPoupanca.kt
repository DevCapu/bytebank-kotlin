package modelo

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
), Transferivel {

    override fun saca(valor: Double) {
        if (valor <= saldo) saldo -= valor
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