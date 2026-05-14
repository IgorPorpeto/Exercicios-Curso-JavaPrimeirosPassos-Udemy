package Exercicios_Udemy_Java_Primeiros_Passos.Aula49_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();

        while (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }

        double nota2 = sc.nextDouble();

        while (nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }

        double media = (nota1 + nota2) / 2.0;
        System.out.printf("media = %.2f%n", media);

        sc.close();
    }
    
}
