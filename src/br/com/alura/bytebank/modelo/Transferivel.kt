package br.com.alura.bytebank.modelo

interface Transferivel {

    fun transfere(valor: Double, destino: Conta): Boolean;
}