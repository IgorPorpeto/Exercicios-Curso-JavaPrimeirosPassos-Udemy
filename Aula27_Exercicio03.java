package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula27_Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("<< Média Idades >>");
        System.out.println();

        System.out.println("Digite o Nome e a Idade da priemria pessoa: ");
        String Nome1 = sc.next();
        int Idade1 = sc.nextInt();
        System.out.println();

        System.out.println("Digite o Nome e a Idade da segunda pessoa: ");
        String Nome2 = sc.next();
        int Idade2 = sc.nextInt();
        System.out.println();

        double Media = (double)(Idade1 + Idade2) / 2; 
        // pode utilizar (double) ou 2.0 para forçar uma conta double.

        System.out.printf("A Idade Média de %s e %s é de %.1f anos.%n", Nome1, Nome2, Media);

        sc.close();
    }
}