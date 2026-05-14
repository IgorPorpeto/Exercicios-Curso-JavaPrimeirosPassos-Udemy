package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;
        double litros;

        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        litros = tempo * velocidade / 12.0;

        System.out.printf("%.3f%n", litros);

        sc.close();
    }
    
}

