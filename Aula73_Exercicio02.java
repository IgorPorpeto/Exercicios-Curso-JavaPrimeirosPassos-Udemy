package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula73_Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        double[][] matriz = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double[] vetor = new double[m];
        
        for (int i = 0; i < m; i++) {
            double soma = 0.0;
            for (int j = 0; j < n; j++) {                
                soma = soma + matriz[i][j];
            }
            vetor[i] = soma;
        }

        for (int i = 0;i < m; i++) {
            System.out.printf("%.1f%n", vetor[i]);
        }

        sc.close();
    }
    
}