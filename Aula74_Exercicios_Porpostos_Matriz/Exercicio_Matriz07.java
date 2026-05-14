package Exercicios_Udemy_Java_Primeiros_Passos.Aula74_Exercicios_Porpostos_Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Matriz07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int fila = sc.nextInt();
		
		// como nossa matriz comeca na linha 0, vamos decrementar o valor da fila
		fila = fila - 1; 

		// passo 1: vamos salvar o ultimo da fila escolhida
		int ultimoDaFila = matriz[fila][n-1];
		
		// passo 2: vamos mover todos da fila (menos o ultimo) para a direita,
		// mas teremos que fazer isso da direita para a esquerda (contagem decrescente)
		for (int j=n-1; j>0; j--) {
			matriz[fila][j] = matriz[fila][j-1];
		}

		// passo 3: agora vamos armazenar o ultimo na primeira posicao da fila
		matriz[fila][0] = ultimoDaFila;
	
		// pronto! Agora vamos imprimir a matriz alterada:
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

        sc.close();
    }
    
}
