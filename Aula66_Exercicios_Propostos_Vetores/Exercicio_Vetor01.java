package Exercicios_Udemy_Java_Primeiros_Passos.Aula66_Exercicios_Propostos_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vetor = new double[N];

        for (int i = 0; i < N; i++) {
        vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        double posicaoMaior = 0;

        for (int i = 1; i < N; i++) {
            if (vetor[i] > maior) {
            maior = vetor[i];
            posicaoMaior = i;
            }
        }

        System.out.printf("%.1f%n", maior);
		System.out.println(posicaoMaior);
       

        sc.close();
    }
    
}
