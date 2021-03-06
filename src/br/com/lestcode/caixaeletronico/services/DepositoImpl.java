package br.com.lestcode.caixaeletronico.services;

import br.com.lestcode.caixaeletronico.model.Conta;
import br.com.lestcode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class DepositoImpl implements Deposito {

    private final MemoriaContaRepository repository;

    public DepositoImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Double execute() {
        Conta conta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        int numeroDaConta = entrada.nextInt();
        conta = repository.findById(numeroDaConta);
        System.out.println("Digite o valor a depositar (máx R$1000,00): ");
        double valor = entrada.nextDouble();
        conta.adicionaSaldo(valor);
        if (valor >= 1.00 && valor <= 1000.00) {
            System.out.println("Foi depositado: R$ " + valor);
        } else {
            System.out.println("Valor invalido!");
            return null;
        }
        System.out.printf("Conta %d o saldo atual é de: R$ %.2f %n", numeroDaConta, conta.getSaldo());
        return valor;
    }
}
