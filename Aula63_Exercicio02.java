package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula63_Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Vetores: ");
        int n =sc.nextInt();
        double[] vetor = new double[n];

        System.out.println("Digite os valores a serem adicionados ao Vetor: (Ex.: 1 -2 5 -1 ....)");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }
        System.out.printf("%.2f%n", soma);

        double media = soma / 4;
        System.out.printf("%.2f%n", media);


        sc.close();
    }
    
}