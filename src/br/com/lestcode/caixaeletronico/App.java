package br.com.lestcode.caixaeletronico;

import br.com.lestcode.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletrônico ligado!");
        System.out.println("Sr(a). Seja Bem Vindo!");
        SelecionaComando selecionaComando = new SelecionaComando();

        while (selecionaComando.executar()){
            System.out.println();
            System.out.println("Execute um novo comando.");

        }

        System.out.println("Atendimento finalizado!");

    }
}
