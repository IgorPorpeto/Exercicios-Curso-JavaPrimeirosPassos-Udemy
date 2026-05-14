package Exercicios_Udemy_Java_Primeiros_Passos.Aula74_Exercicios_Porpostos_Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        double[][] matriz = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        //a) SOMA DOS POSITIVOS
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0.0){
                    soma = soma + matriz[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

        //b) LINHA ESCOLHIDA
        System.out.print("LINHA ESCOLHIDA: ");
		for (int j=0; j<n; j++) {
			System.out.printf("%.1f ", matriz[linha][j]);
		}
		System.out.println();

        //c) COLUNA ESCOLHIDA
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", matriz[i][coluna]);
        }
        System.out.println();

        //d) DIAGONAL PRINCIPAL
        System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", matriz[i][i]);
		}
		System.out.println();

        //e) Negativos ao Quadrado
        for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (matriz[i][j] < 0.0) {
					matriz[i][j] = matriz[i][j] * matriz[i][j];
				}
			}
		}

        System.out.println("MATRIZ ALTERADA:");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("%.1f ", matriz[i][j]);
			}
			System.out.println();
		}


        sc.close();
    }
    
}
