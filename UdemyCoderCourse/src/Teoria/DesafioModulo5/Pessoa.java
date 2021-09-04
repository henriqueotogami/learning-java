package Teoria.DesafioModulo5;

public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar(){
        return "Eu sou o " + nome + "e tenho " + peso + " Kgs.";
    }
}
