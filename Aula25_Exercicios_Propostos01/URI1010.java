package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        @SuppressWarnings("unused")
        int CP1, NP1, CP2, NP2;
        double VUP1, VUP2, Total;

        CP1 = sc.nextInt();
        NP1 = sc.nextInt();
        VUP1 = sc.nextDouble();

        CP2 = sc.nextInt();
        NP2 = sc.nextInt();
        VUP2 = sc.nextDouble();

        Total = (NP1 * VUP1) + (NP2 * VUP2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", Total);


        sc.close();
    }
    
}
