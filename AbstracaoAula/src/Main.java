import Exercicios.*;
import formas.Circulo;
import formas.FormasGeometricas;
import formas.Quadrado;

public class Main {
    public static void main(String[] args) {

        //Circulo, Quadrado eles vao ter metodos para calcular area
        //Cirar interfaces
        Exibir prod1 = new Produto ("ma", 3);
        prod1.exibirDetalhes();

        OperacoesConta conta = new ContaBancaria("555555",200);
        conta.consultarSaldo();

        Concluivel tarefa = new Tarefa ("ola", false);
        tarefa.concluir();

    }
}