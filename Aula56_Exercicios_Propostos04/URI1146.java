package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        while (X != 0) {
            for (int i = 1; i <= X; i++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
            X = sc.nextInt();
        }

        sc.close();
    }
    
}
