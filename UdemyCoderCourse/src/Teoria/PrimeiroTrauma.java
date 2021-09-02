package Teoria;

import static com.sun.tools.doclint.Entity.Prime;

public class PrimeiroTrauma {

    int a = 3;
    static final int b = 4;

    public static void main (String[] args) {

        PrimeiroTrauma value = new PrimeiroTrauma();
        // Só é possível acessar um membro de instância, a partir de um método estático
        // se for criada uma instância novamente.
        System.out.println(value.a);

        // É possível acessar um membro de instância estático a partir de um método estático
        System.out.println(b);
    }

}
