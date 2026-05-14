package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1052 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Mes = sc.nextInt();

        if (Mes == 1) {
            System.out.println("January");
        }
        else if (Mes == 2) {
            System.out.println("February");
        }
        else if (Mes == 3) {
            System.out.println("March");
        }
        else if (Mes == 4) {
            System.out.println("April");
        }
        else if (Mes == 5) {
            System.out.println("May");
        }
        else if (Mes == 6) {
            System.out.println("June");
        }
        else if (Mes == 7) {
            System.out.println("July");
        }
        else if (Mes == 8) {
            System.out.println("August");
        }
        else if (Mes == 9) {
            System.out.println("September");
        }
        else if (Mes == 10) {
            System.out.println("October");
        }
        else if (Mes == 11) {
            System.out.println("November");
        }
        else if (Mes == 12) {
            System.out.println("December");
        }
        else {
            System.out.println("Mes nao existe");
        }

        sc.close();
    }
    
}
