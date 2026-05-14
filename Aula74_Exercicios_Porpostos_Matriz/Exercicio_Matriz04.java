package Exercicios_Udemy_Java_Primeiros_Passos.Aula74_Exercicios_Porpostos_Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + matriz[i][i];
        }
        System.out.println(soma);
       

        sc.close();
    }
    
}