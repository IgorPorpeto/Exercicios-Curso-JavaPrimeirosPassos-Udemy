package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double total;

        if (x ==1) {
            total = 4.00 * y;
        }
        else if (x == 2) {
            total = 4.50 * y;
        }
        else if (x == 3) {
            total = 5.00 * y;
        }
        else if (x == 4) {
            total = 2.00 * y;
        }
        else {
            total = 1.50 * y;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}