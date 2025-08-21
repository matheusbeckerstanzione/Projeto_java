package formas;

public class Circulo implements FormasGeometricas {

    public double raio;
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcualarArea() {
        double area = Math.PI * raio * raio;
        System.out.println(area);
    }
}
