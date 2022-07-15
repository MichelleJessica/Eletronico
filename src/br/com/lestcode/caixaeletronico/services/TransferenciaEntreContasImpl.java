package br.com.lestcode.caixaeletronico.services;

import br.com.lestcode.caixaeletronico.model.Conta;
import br.com.lestcode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;


public class TransferenciaEntreContasImpl implements Transferencia {

    private final MemoriaContaRepository repository;

    public TransferenciaEntreContasImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void transferir() {
        Conta contaDestino;
        Conta contaOrigem;
        double valor = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero da conta que ira sair o valor: ");
        int numeroContaDeOrigem = entrada.nextInt();
        contaOrigem = repository.findById(numeroContaDeOrigem);
        System.out.println("Digite o numero da conta de destino: ");
        int numeroContaDestino = entrada.nextInt();
        contaDestino = repository.findById(numeroContaDestino);
        System.out.println("Digite o valor a transferir (máx R$500,00): ");
        valor = entrada.nextDouble();
        contaOrigem.retirarSaldo(valor);
        contaDestino.adicionaSaldo(valor);
        if (valor >= 1.00 && valor <= 500.00) {
            System.out.printf("O valor de R$ %.2f, foi transferido da conta %d para a conta %d.", valor, numeroContaDeOrigem, numeroContaDestino);
            System.out.println();
            System.out.printf("Conta %d, seu saldo atual é de R$ %.2f. %n", numeroContaDeOrigem, contaOrigem.getSaldo());
        } else {
            System.out.println("Valor invalido!");
            return;
        }

    }

}
