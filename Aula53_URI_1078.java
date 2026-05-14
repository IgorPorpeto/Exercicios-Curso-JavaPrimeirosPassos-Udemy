package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula53_URI_1078 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int total = i * N;
            System.out.println(i + " x " + N + " = " + total);
        }

        sc.close();
    }
    
}
