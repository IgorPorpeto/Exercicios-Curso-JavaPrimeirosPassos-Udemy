package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula62_Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Vetores: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os valores a serem adicionados ao Vetor: (Ex.: 1 -2 5 -1 ....)");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();            
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
    
}
