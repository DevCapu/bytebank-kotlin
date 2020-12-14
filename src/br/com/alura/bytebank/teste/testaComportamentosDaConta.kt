import br.com.alura.bytebank.modelo.Conta

fun testaComportamentosDaConta() {
    val contaFelipe = Conta("Felipe Moreno Borges", 1001)
    contaFelipe.deposita(1800.00)
    contaFelipe.deposita(50.00)
    contaFelipe.saca(100.00)
}