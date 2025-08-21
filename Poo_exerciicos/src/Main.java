    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {

            ContaBancaria conta = new ContaBancaria();

            conta.saldo = 2000;
            conta.titular = "Matheus";

            conta.depositar(200);
             conta.sacar(500);

            System.out.println(conta.saldo);
            }

        }
