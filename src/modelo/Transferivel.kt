package modelo

import modelo.Conta

interface Transferivel {

    fun transfere(valor: Double, destino: Conta): Boolean;
}