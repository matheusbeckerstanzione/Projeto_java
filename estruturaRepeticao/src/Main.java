import java.util.Scanner;

class VerificaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;
        System.out.print("Digite a senha: ");
        senha = scanner.nextInt();

    while (senha != 123){
        System.out.println("senha incorreta, digite novamente ");

senha = scanner.nextInt();

    }
        System.out.println("senha correta");

        int numero = 1;

        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
    }
}
