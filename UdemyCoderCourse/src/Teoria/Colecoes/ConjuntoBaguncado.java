package Teoria.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // Conversao automatica de tipos primitivos para classes
        conjunto.add(1.2);      // double -> Double
        conjunto.add(true);     // boolean -> Boolean
        conjunto.add("Teste");  // String
        conjunto.add(1);        // int -> Integer
        conjunto.add('x');      // char -> Character

        System.out.println("Tamanho da colecao Set: " + conjunto.size());
        // Tamanho da colecao Set eh 5

        conjunto.add("Teste");
        // false, nao aceita repeticao

        conjunto.add('x');
        // false, nao aceita repeticao

        System.out.println("Tamanho da colecao Set: " + conjunto.size());
        // Permanece sendo 5

        System.out.println(conjunto.remove("teste"));
        // false, porque nao existe esse valor na colecao

        System.out.println(conjunto.remove("Texte"));
        // true

        System.out.println(conjunto.remove('x'));
        // true

        System.out.println("Tamanho da colecao Set: " + conjunto.size());
        // Tamanho da colecao Set eh 3

        System.out.println(conjunto.contains('x'));
        // false

        System.out.println(conjunto.contains(1));
        // true

        Set numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("Numeros: " + numeros);
        // [1, 2, 3]

        System.out.println("Conjunto: " + conjunto);
        // [1.2, 1, true]

        conjunto.addAll(numeros);
        System.out.println("Conjunto: " + conjunto);
        // [1.2, 1, 2, 3, true]

        conjunto.retainAll(numeros);
        // realiza a intersecao, ou seja, os elementos em comuns entre as duas variaveis
        System.out.println("Conjunto: " + conjunto);
        // [1, 2, 3]

        conjunto.clear();
        System.out.println("Conjunto: " + conjunto);
        // []
    }
}
