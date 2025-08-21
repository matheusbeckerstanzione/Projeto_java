public class ContaBancaria {
    public String titular;
    public double saldo;

    //metodos
    public void depositar(double valor){
       // sado = sado + valor;
        saldo += valor;
    }
public void sacar(double valor){
        saldo -= valor;
}

public void  exibirDados(){
    System.out.println("Titular " + titular);//aqui esta aparecendo TITULAR matheus
    System.out.println("Saldo " + saldo);//aqui esta aparecendo SALDO 200
}
}
