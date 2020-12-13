package modelo

abstract class Conta(
    val titular: String,
    val numero: Int
) {

    var saldo = 0.0
        protected set

    abstract fun saca(valor: Double);

    fun deposita(valor: Double) { if (valor > 0) this.saldo += valor }
}