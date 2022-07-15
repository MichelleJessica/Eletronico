package br.com.lestcode.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("Segue as opções abaixo:");
        System.out.println("1 -> Saque");
        System.out.println("2 -> Deposito");
        System.out.println("3 -> Abra uma conta");
        System.out.println("4 -> Transferencias entre Contas");
        System.out.println("0 -> Sair");
    }
}
