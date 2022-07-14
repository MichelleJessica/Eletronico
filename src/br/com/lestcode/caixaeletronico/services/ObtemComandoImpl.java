package br.com.lestcode.caixaeletronico.services;

import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando {

    @Override
    public int execute() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a opção: ");
        int comando = entrada.nextInt();
        return comando;
    }
}
