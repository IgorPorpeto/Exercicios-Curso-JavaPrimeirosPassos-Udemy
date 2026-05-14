package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NF, HT;
        double VH, SAL;

        NF = sc.nextInt();
        HT = sc.nextInt();
        VH = sc.nextDouble();

        SAL = HT * VH;

        System.out.println("NUMBER = " + NF);
        System.out.printf("SALARY = U$ %.2f%n", SAL);

        sc.close();
    }
    
}
