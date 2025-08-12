public class Main {
    //METODO QUE DA BOM DIA
    //FUNCAO SEM RETORNO - VOID
        public static void darBomDia(){
            System.out.println("bom dia");//escrevi um bom dia para aparecer no terminal
        }
        // FUNCAO com PARAMETRO
        // (RECEBE O NOME)
        public static void saudar (String nome){
            System.out.println("bom dia " + nome);

        }

        public static void subtrair (int num1, int num2){
            System.out.println(num1 - num2);
        }

        //FUNCAO COM RETORNO
    public static int somar (int num1, int num2) {
            int resultado = num1 + num2;
            return resultado;

    }

    public static void mostrarMensagem(){
        System.out.println("Bem vindo");

    }

    public static void  mostrarODobro (int num3) {//
        int resultado = num3 * 2 ;
        System.out.println(resultado);

    }

    public static void  dividir (int num4, int num5) {
        int resultado = (num4 + num5) / 2 ;
        System.out.println(resultado);

    }

    public static boolean par(int num6 ){
        boolean resultado = num6 % 2 == 0 ;
        System.out.println(resultado);

        return resultado;

    }

    public static double calcularMedia (int num7, int num8){
       double resultado = (num7 + num8) / 2;
        System.out.println(resultado);

        return resultado;

    }

    public static void main(String[] args) {

        /*vetores - lista de elementos
        String[] nomes = {"vini", "fulano", "teste"};

        /scanner
        Scanner sc = new Scanner(System.in);//criei o scanner
        sc.nextLine();//esta aparecendo para eu digitar

        sc.close();//fechar o escaner, lembrar de fechar o scanner*/

        //public static - RETORNO - NOME DA FUNCAO - (PARAMETROS)
        //{CODIGO DA FUNCAO}
        darBomDia();

        saudar("vini");//SO COLOCAR O NOME PQ A VARIAVEL JA VAI DIRETO

        subtrair(8 , 4);

        int somar = somar(10, 5);

        System.out.println(somar);

        mostrarMensagem();

        mostrarODobro(5);

        dividir(2 , 10);

        boolean resultado = par(4);

        calcularMedia(10, 4);

        }
    }
