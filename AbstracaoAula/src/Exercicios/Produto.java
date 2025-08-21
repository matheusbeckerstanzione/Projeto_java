package Exercicios;

public class Produto implements Exibir {

   public String nome;
   public double preco;

   public Produto (String nome, double preco){
       this.nome = nome;
       this.preco = preco;

   }


    @Override
    public void exibirDetalhes() {
        System.out.println(nome);
        System.out.println(preco);
    }
}
