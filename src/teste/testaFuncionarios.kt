package teste

import modelo.*
import testaComportamentosDaConta

fun testaFuncionarios() {
    print(
        "Bem vindo ao ByteBank \n" + "*----------------------------------------*"
    )
    testaComportamentosDaConta()
    val contaFelipe = ContaCorrente("Felipe Moreno Borges", 78965)
    contaFelipe.deposita(500.00)


    val tais = Analista(
        nome = "Tais",
        cpf = "49121530874",
        salario = 3090.76
    )

    val sergio = Diretor(
        "Sérgio",
        "49121530874",
        10000.00,
        1983,
        0.10
    )
    println(sergio.autentica(1984))
    println(sergio.autentica(1983))

    val cadu = Gerente(
        "Carlos Muller",
        "49121530874",
        5000.00,
        4865
    )

    println(cadu.autentica(4865))

    println(tais)
    println(sergio)
    println(cadu)


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(tais)
    calculadora.registra(sergio)
    calculadora.registra(cadu)

    println(calculadora.total)
}

