package Teoria;

public class AreaCirc {

    double raio;
    static double PI = 0;
    static double diametro = 10.0;

    AreaCirc(double raioInicial) {
        PI = 3.14;
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
}
