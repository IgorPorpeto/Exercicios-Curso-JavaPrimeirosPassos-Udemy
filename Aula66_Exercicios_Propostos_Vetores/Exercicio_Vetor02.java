package Exercicios_Udemy_Java_Primeiros_Passos.Aula66_Exercicios_Propostos_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {            
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");                
            }            
        }

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                contador++;                
            }
        }

        System.out.println();
        System.out.println(contador);

        sc.close();
    }
    
}