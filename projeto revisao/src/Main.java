//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int numero;

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
        System.out.println("tempo");

        Scanner scanner = new Scanner(System.in);// aq eu criei o scanner
        System.out.print("Digite um número inteiro: ");//aqui estou pedindo para o usuario digitar o numero
        int numero1 = scanner.nextInt();


        System.out.println("Tabuada do " + numero1 + ":");//aqui esta escrevendo no terminal a tabuada e o numero
        for (int i = 1; i <= 10; i++) {
            int resultado = numero1 * i;// aq e a variavel
            System.out.println(numero1 + " x " + i + " = " + resultado);//aqui esta escrevendo no munitor o x e o =
        }

        scanner.close();//aqui ele esta lendo
        }
    }
