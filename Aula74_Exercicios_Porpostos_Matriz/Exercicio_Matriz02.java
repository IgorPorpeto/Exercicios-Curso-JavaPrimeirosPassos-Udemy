package Exercicios_Udemy_Java_Primeiros_Passos.Aula74_Exercicios_Porpostos_Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz02 {
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

        for (int i = 0; i < n; i++) {
            int soma = 0;
            for (int j = 0; j < n; j++) {
                soma = soma + matriz [i][j];
            }
            System.out.println(soma);
        }

        sc.close();
    }
    
}
