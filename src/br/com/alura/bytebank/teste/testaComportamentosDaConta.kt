import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosDaConta() {
    val contaFelipe = ContaCorrente(
        Cliente(
            nome = "Felipe Moreno Brges",
            cpf = "491.215.308-74",
            senha = 1234,
            endereco = Endereco()
        ),
        1001
    )
    contaFelipe.deposita(1800.00)
    contaFelipe.deposita(50.00)
    contaFelipe.saca(100.00)
}