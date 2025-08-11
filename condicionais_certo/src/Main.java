
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis
        //int idade;
        //idade = 25;

        // Condicionais

        // Scanner - Ler dados
        Scanner sc = new Scanner(System.in);

        //           ler textos - nextLine()
        String nome = sc.nextLine();

        //           ler double - nextDouble()
        double preco = sc.nextDouble();

        //           ler inteiros - nextInt()
        int idade = sc.nextInt();

        // CONDICIONAIS
        // Tomar decisões

        // Simples
        // if (PERGUNTA - CONDIÇÃO) {O QUE FAZER}
        if (idade > 18) {
            System.out.println("Voce é maior de idade!");
        }

        // Composta
        // SE
        if (idade > 18) {
            System.out.println("Voce é maior de idade!");

        }
        // SENÃO
        else {
            System.out.println("Voce é menor de idade!");
        }

        // Encadeada
        // Aprovado, recuperacao, reprovou
        int nota = 6;

        // SE ELE FOI APROVADO
        if (nota > 6) {
            System.out.println("APROVADO!");
        }
        else if(nota > 4) {
            System.out.println("RECUPERAÇÃO!");
        }
        else {
            System.out.println("REPROVADO!");
        }
        }
    }