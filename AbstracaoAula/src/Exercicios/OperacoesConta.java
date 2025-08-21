package Exercicios;

public interface OperacoesConta {
    void depositar(double valor);
            void sacar(double valor);
            void consultarSaldo();

    // Metodo para tarnsferir
    double transferir(ContaBancaria contaBancaria, double valor);
}
