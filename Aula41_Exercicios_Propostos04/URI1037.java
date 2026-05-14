package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        double x;
        
        x = sc.nextDouble();

        if (x >= 0.0000 && x <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        }
        else if (x > 25.00001 && x <= 50.0000) {
            System.out.println("Intervalo (25,50]");
        }
        else if (x > 50.00001 && x <= 75.0000) {
            System.out.println("Intervalo (50,75]");
        }
        else if (x > 75.00001 && x <= 100.0000) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
        

        sc.close();
    }
}

