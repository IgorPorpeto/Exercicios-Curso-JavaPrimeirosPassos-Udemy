package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double X;
        int totalPositive = 0;

        for (int i = 0; i < 6; i++) {
            X = sc.nextDouble();
            if (X > 0) {
                totalPositive += 1;
            }
        }
        System.out.println(totalPositive + " valores positivos");

        sc.close();
    }
    
}
