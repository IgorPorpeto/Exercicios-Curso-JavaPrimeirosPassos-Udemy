package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int inicio = 1;
		
		for (int i=1; i<=N; i++) {
			
			int segundo = inicio + 1;
			int terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM%n", inicio, segundo, terceiro);

			inicio = inicio + 4;
		}

        sc.close();
    }
    
}
