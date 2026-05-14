package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int total;

        if (A < B) {
            total = B - A;
        }
        else {
            total = 24 - A + B;
        }

        System.out.println("O JOGO DUROU " + total + " HORA(S)");


        sc.close();
    }
}