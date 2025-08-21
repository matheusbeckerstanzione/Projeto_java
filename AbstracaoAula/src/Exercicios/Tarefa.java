package Exercicios;

public class Tarefa implements Concluivel{

    String discricao;
    boolean concluida;

    public Tarefa (String discricao, boolean concluida){
        this.discricao = discricao;
        this.concluida = concluida;
    }

    @Override
    public void concluir() {

        concluida = true;
        System.out.println(discricao);
        System.out.println(concluida);
    }

    @Override
    public boolean vestaConcluida() {

        return false;
    }
}
