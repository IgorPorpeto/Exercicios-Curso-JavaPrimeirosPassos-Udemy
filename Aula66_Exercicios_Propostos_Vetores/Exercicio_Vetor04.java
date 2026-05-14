package Exercicios_Udemy_Java_Primeiros_Passos.Aula66_Exercicios_Propostos_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i ++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i ++) {
            soma = soma + vetor[i];
        }
        
        double media = soma / n;
        System.out.printf("%.3f%n", media);
        
        for (int i = 0; i < n; i ++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
       

        sc.close();
    }
    
}
