package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1145 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i=1; i<=y; i++) {
			System.out.print(i);
			if (i % x == 0) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}

        sc.close();
    }
    
}
