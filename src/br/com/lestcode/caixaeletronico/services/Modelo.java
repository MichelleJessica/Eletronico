package br.com.lestcode.caixaeletronico.services;

public class Modelo {

    boolean resultado;
    public boolean Executa(int comando){

    switch (comando)

    {
        case 0:
            System.out.println("Encerrado");
            resultado = false;
            break;

        case 1:
            System.out.println("Sacando");
            break;

        case 2:
            System.out.println("Depositando");
            break;

        default:
            System.out.println("Opção invalida");
    }
    return resultado;
    }
}
