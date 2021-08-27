package Teoria;

public class AreaCirc {

    double raio;
    static final double PI;
    static double diametro = 10.0;

    AreaCirc(double raioInicial) {
        PI = 3.14;
        raio = raioInicial;
    }

    double area() {
        return pi * Math.pow(raio, 2);
    }
}
