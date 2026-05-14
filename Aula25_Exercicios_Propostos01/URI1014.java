package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X;
        double Y, consumo;

        X = sc.nextInt();
        Y = sc.nextDouble();

        consumo = X / Y;

        System.out.printf("%.3f Km/L", consumo);

        sc.close();
    }
} 