package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        sc.close();

    }
}