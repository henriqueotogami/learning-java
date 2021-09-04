package Teoria.DesafioModulo5;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.180);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p = new Pessoa ("João", 99.8);

        System.out.println(p.apresentar());
        p.comer(c1);
        System.out.println(p.apresentar());

    }
}
