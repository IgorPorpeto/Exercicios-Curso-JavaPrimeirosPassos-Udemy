package Exercicios_Udemy_Java_Primeiros_Passos.Aula66_Exercicios_Propostos_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        for (int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.print(vetorC[i] + " ");
        }

        System.out.println();

        sc.close();
    }
    
}
