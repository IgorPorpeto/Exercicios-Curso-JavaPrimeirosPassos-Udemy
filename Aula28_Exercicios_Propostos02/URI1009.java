package Exercicios_Udemy_Java_Primeiros_Passos.Aula28_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1009 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String N;
        double SF, TV, Bonus, SL;

        N = sc.nextLine();
        SF = sc.nextDouble();
        TV = sc.nextDouble();

        Bonus = TV * 0.15;
        SL = SF + Bonus;

        System.out.printf("TOTAL = R$ %.2f%n", SL);

        sc.close();
    }
    
}