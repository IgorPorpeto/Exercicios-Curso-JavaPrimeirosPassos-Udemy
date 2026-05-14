package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int In = 0;
        int Out = 0;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();

            if (X >= 10 && X <= 20) {
                In = In +1;
            }
            else {
                Out = Out + 1;
            }
        }

        System.out.println(In + " in");
        System.out.println(Out + " out");

        sc.close();
    }
    
}

