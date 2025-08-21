package formas;
public class Quadrado implements FormasGeometricas {
    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void calcualarArea() {
        double area =lado * lado;
        System.out.println(area);
    }
}