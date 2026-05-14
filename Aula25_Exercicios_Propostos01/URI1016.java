package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Y, minutos;

        Y = sc.nextInt();

        minutos = Y * 2;

        System.out.println(minutos + " minutos");

        sc.close();
    }
    
}
