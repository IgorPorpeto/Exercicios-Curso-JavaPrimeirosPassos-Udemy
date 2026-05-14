package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1074 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
    
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X % 2 != 0 && X < 0) {
                System.out.println("ODD NEGATIVE");
            }
            else if (X % 2 != 0 && X > 0) {
                System.out.println("ODD POSITIVE");
            }
            else if (X % 2 == 0 && X < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if (X % 2 == 0 && X > 0) {
                System.out.println("EVEN POSITIVE");
            }
            else {
                System.out.println("NULL");
            }
        }

        sc.close();
    }
    
}

