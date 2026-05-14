package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        double x, y, nx, p;
        
        x = sc.nextDouble();

        if (x <= 400.00) {
            p = 15.0;
        }
        else if (x <= 800.00) {
            p = 12.0;
        }
        else if (x <= 1200.00) {
            p = 10.0;
        }
        else if (x <= 2000.00) {
            p = 7.0;
        }
        else {
            p = 4.0;  
        }
        y = x * (p / 100);
        nx = x + y;

        System.out.printf("Novo salario: %.2f%n", nx);
        System.out.printf("Reajuste ganho: %.2f%n", y);
        System.out.printf("Em percentual: %.0f %%n", p);

        sc.close();
    }
}
