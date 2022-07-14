package br.com.lestcode.caixaeletronico.services;

import br.com.lestcode.caixaeletronico.model.Conta;
import br.com.lestcode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class DepositoImpl implements Deposito {

    private int numeroDaConta;
    private double valor;

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Double execute() {
        Conta conta;
        conta = repository.findById(numeroDaConta);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor a depositar (máx R$1000,00): ");
        this.valor = entrada.nextDouble();
        conta.adicionaSaldo(valor);
        if (valor >= 1.00 && valor <= 1000.00) {
            System.out.println("Foi depositado: R$ " + valor);
            System.out.printf("Conta %d o saldo atual é de: R$ %.2f", numeroDaConta, conta.getSaldo());
        } else {
            System.out.println("Valor invalido!");
            return null;
        }
        return valor;
    }
}
