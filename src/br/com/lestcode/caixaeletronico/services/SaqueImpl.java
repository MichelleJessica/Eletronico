package br.com.lestcode.caixaeletronico.services;

import br.com.lestcode.caixaeletronico.model.Conta;
import br.com.lestcode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class SaqueImpl implements Saque {

    private double valor;

    private final MemoriaContaRepository repository;

    public SaqueImpl(MemoriaContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Double execute() {
        Scanner entrada = new Scanner(System.in);
        Conta conta;
        System.out.println("Digite o numero da conta: ");
        int numeroDaConta = entrada.nextInt();
        conta = repository.findById(numeroDaConta);
        System.out.println(" Digite o valor a sacar entre as opções abaixo: ");
        System.out.println("R$10,00 / R$20,00 / R$50,00 / R$100,00");
        this.valor = entrada.nextDouble();
        conta.retirarSaldo(valor);
        if (valor == 10.00) {
            System.out.println("Conta: " + numeroDaConta + ", foi sacado R$10,00");
            System.out.printf("O saldo atual é de: R$ %.2f", conta.getSaldo());
        } else if (valor == 20.00) {
            System.out.println("Conta: " + numeroDaConta + ", foi sacado R$20,00");
            System.out.printf("O saldo atual é de: R$ %.2f", conta.getSaldo());
        } else if (valor == 50.00) {
            System.out.println("Conta: " + numeroDaConta + ", foi sacado R$50,00");
            System.out.printf("O saldo atual é de: R$ %.2f", conta.getSaldo());
        } else if (valor == 100.00) {
            System.out.println("Conta: " + numeroDaConta + ", foi sacado R$100,00");
            System.out.printf("O saldo atual é de: R$ %.2f", conta.getSaldo());
        } else {
            System.out.println("Valor invalido!");
            return null;
        }
        return valor;
    }
}
