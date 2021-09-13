package Teoria.Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        Set<String> listaAprovados = new HashSet<String>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
        // Utilizando o HashSet, os dados não serão impressoas conforme a ordem de armazenamento

        SortedSet<String> listaAprovados2 = new TreeSet<String>();
        listaAprovados2.add("Ana");
        listaAprovados2.add("Carlos");
        listaAprovados2.add("Luca");
        listaAprovados2.add("Pedro");

        for (String candidato : listaAprovados2) {
            System.out.println(candidato);
        }
        // Utilizando o TreeSet, a ordem de armazenamento será impressa

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(120);
        numeros.add(6);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    // Assim, será impresso na ordem

}
