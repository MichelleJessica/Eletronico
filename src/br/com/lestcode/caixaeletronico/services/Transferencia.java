package br.com.lestcode.caixaeletronico.services;

import br.com.lestcode.caixaeletronico.model.Conta;

/**
 * Transferir o valor da conta de origem para a conta destino.
 */

public interface Transferencia {
    void transferir (double valor, Conta numeroContaDestino, Conta origem);

}



