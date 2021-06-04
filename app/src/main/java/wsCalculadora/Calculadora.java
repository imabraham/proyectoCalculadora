package wsCalculadora;

public class Calculadora {
    public double suma(double x, double y)
    {
        return x + y;
    }

    public double multiplica(double x, double y) {
        return x * y;
    }

    public double seno(double x) {
        return Math.sin(x);
    }

    public double coseno(double x) {
        return Math.cos(x);
    }

    public double tangente(double x) {
        return Math.tan(x);
    }
    public double resta(double a, double b){
        return a-b;
    }
    
    public double exponencial(double x, double y) {
        return Math.pow(x,y);
    }

    public double division(double x, double y) {
        return x/y;
    }

    public double log(double x){
        return Math.log10(x);
    }
    
    public double ln(double x) {
        return Math.log(x);
    }

    public double radical(double x, double numerador, double denominador) {
        return Math.pow(x, (double) numerador / denominador);
    }

}
