package Teoria;

public class AreaCircTeste {

    public static void main(String[] args) {


        // Instancia
        AreaCirc areaOne = new AreaCirc(10);

        // Acesso a instancia abaixo não pode ser realizado quando o atributo eh estatico na classe
        //areaOne.diametro = 10;
        System.out.println(areaOne.area());

        AreaCirc areaTwo = new AreaCirc(5);

        // Acesso a instancia abaixo não pode ser realizado quando o atributo eh estatico na classe
        //areaTwo.diametro = 5;

        // Para acessar o atributo da classe, deve ser realizado diretamente que
        // Atributos de classe sao indicados em italico
        AreaCirc.diametro = 20.50;
        System.out.println(areaTwo.area());

        // Constantes, por convencao, sao utilizadas em maiusculo
        System.out.println(AreaCirc.PI);

    }
}
