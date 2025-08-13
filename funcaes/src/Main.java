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
//exercicio 1
    public static void mostrarMensagem(){
        System.out.println("Bem vindo");

    }
//exercicio 2
    public static void  mostrarODobro (int num3) {//
        int resultado = num3 * 2 ;
        System.out.println(resultado);

    }
//exercicio 3
    public static void  dividir (int num4, int num5) {
        int resultado = (num4 + num5) / 2 ;
        System.out.println(resultado);

    }
//exercicio 4
    public static boolean par(int num6 ){
        boolean resultado = num6 % 2 == 0 ;
        System.out.println(resultado);

        return resultado;

    }
//exercicio 5
    public static double calcularMedia (int num7, int num8){//criei a variavel
       double resultado = (num7 + num8) / 2;//chamei a variavel para dividir e fazer a media
        System.out.println(resultado);

        return resultado;

    }
//Crie a função celsiusParaFahrenheit que receba uma temperatura em Celsius e exiba no console o valor convertido para Fahrenheit.
//Fórmula: F = C * 1,8 + 32
//Parâmetro: decimal (double ou float)
//Retorno: nenhum (void)
//Exemplo:
//celsiusParaFahrenheit(0);   // Saída: 32.0°F
//celsiusParaFahrenheit(25);  // Saída: 77.0°F

    //exercicio extra
    public static double celsiusParaFahrenheit (double temperatura){
            double resultado = ((temperatura * 1.8) + 32);
        return resultado;

    }

    public static double calcularAreaRetangulo(double altura, double largura){
            double resultado = altura * largura;
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

        subtrair(8 , 4);//estou chamando a funcao

        int somar = somar(10, 5);//estou chamando a funcao

        System.out.println(somar);//estou chamando a funcao

        mostrarMensagem();//estou chamando a funcao

        mostrarODobro(5);//estou chamando a funcao

        dividir(2 , 10);//estou chamando a funcao

        boolean resultado = par(4);//estou chamando a funcao

        calcularMedia(10, 4);//estou chamando a funcao

        celsiusParaFahrenheit (30);
        System.out.println(celsiusParaFahrenheit(30));

        double areaRetangulo = calcularAreaRetangulo(30, 30);

        System.out.println(areaRetangulo);
        }
    }
