package Exercicios_Udemy_Java_Primeiros_Passos.Aula74_Exercicios_Porpostos_Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Valores Negativos: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }

        sc.close();
    }
    
}