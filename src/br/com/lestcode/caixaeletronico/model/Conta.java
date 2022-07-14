package br.com.lestcode.caixaeletronico.model;

public class Conta {

    private int numeroDaConta;

    private double saldo;

    public Conta(){
        saldo = 0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void adicionaSaldo(double valor){
        saldo = saldo + valor;
    }

    public boolean retirarSaldo(double valor){
        if (saldo >= valor) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
