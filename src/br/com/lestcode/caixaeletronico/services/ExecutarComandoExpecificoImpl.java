package br.com.lestcode.caixaeletronico.services;

import br.com.lestcode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoExpecificoImpl implements ExecutarComandoExpecifico {

    private final Saque saque;
    private final Deposito deposito;
    private final AbrirConta abrirConta;

    public ExecutarComandoExpecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.saque = new SaqueImpl(repository);
        this.deposito = new DepositoImpl(repository);
        this.abrirConta = new AbrirContaImpl(repository);
    }

    // implementar as interfaces / usar if else no metodo sacar
    //
    //    public interface Saque {
//        Double execute(double valor, String numeroDaConta);
//    }
//    public interface Deposito {
//
//        void execute(double valor, String numeroDaConta);
//    }
    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        if (comando == 1) {
            System.out.println("Digite o numero da conta: ");
            String numero = entrada.next();
            saque.execute();
            return true;
        } else if (comando == 2) {
            System.out.println("Digite o numero da conta: ");
            String numero = entrada.next();
            deposito.execute();
            return true;
        } else if (comando == 3) {
            abrirConta.execute();
            return true;
        } else if (comando == 0) {
            System.out.println("Transação encerrada!");
            return false;
        } else {
            System.out.println("Opção invalida");
            return true;
        }
    }
}