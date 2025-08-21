
package Exercicios;


public class ContaBancaria implements OperacoesConta {
    // Atributos
    private String numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Saldo atual: " + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saldo atual: " + saldo);
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    // Metodo para tarnsferir
    @Override
    public double transferir(ContaBancaria contaBancaria, double valor) {
        return 0;
    }
    }

