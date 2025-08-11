import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // exercicio 1
        System.out.println("Ola matheus, tudo bem? ");// esse codigo vai fazer aparecer a mensagem no terminal

        //exercicio 2
        int numero= 10;

        System.out.println("Resultado: " + numero ); //esse codigo vai fazer aparecer a mensagem no terminal mais ele vai atribuir o valor

        //exercico 3
        int valor;
        valor = 20;

        int calculo = valor + 2 ;
        System.out.println("Resultado: " + calculo);

        //exercicio 4
        System.out.println(numero * valor);//efetuei o codigo o valor do numero vezes o valor

        //exercicio 5 intermediario
        String nome = "Ana";
        System.out.println("ola querida " + nome  );

        //exercicio 6 intermediario
        int n1 = 5;
        int resultado = n1 * 2;
        System.out.println("Resultado: " + resultado);

        //exercicio 7 intermediario
        double n2 = 5;//Variavel
        double n3 = 3;//Variavel
        double n4 = 2;//Variavel
        System.out.println((n2 + n3 + n4 ) / 3);// ou usar o (double)

        //exercicio 8 intermediario
        int n5 = 10;
        int n6 = 20;

    boolean maior = (n1 > n2);// esta falando se o primeiro numero e maior que o segundo
        System.out.println("n1 e maior q n2: " + maior);// esta falando no terminal se o primeiro numero e maior que o primiro




    Scanner sc = new Scanner(System.in); // Leio coisas no terminal - Scanner

        //Pergunta o nome
        System.out.print("digite o seu nome: ");
        String nome3 = sc.nextLine ();

        //Perguntar a minha idade
        System.out.println("digite a sua idade: ");
        int minhaIdade = sc.nextInt();


        // Tomar decisao - estrutura condicionais
        //se a pessoa e maior de idade "pode passar"
        // se nao "nao pode passar "
        int idadematheus =  18;

        if (idadematheus >= 18){
            System.out.println("Pode entrar ");
        }
        else  {
            System.out.println("nao pode entrar");
        }

           else if (idadematheus) {
            System.out.println("");
        }


    }
    }