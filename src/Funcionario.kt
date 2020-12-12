abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double

    override fun toString(): String {
        return "Nome: ${this.nome}\n" +
                "CPF: ${this.cpf}\n" +
                "Salário:  ${this.salario}\n" +
                "Bonificação: ${this.bonificacao}\n" +
                "*----------------------------------------*"
    }
}
