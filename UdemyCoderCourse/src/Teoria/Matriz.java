package Teoria;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno?");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];
        double total = 0;

        for (int aluno = 0; aluno < notasTurma.length; aluno++) {
            for (int nota = 0; nota < notasTurma.length; nota++) {

                System.out.printf("Informe a nota %d do aluno %d ", (nota + 1), (aluno +1));
                notasTurma[aluno][nota] = entrada.nextDouble();
                total += notasTurma[aluno][nota];
            }
        }
        entrada.close();

    }
}
