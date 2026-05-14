package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0) {
            int maior = m;
            int menor = n;

                if (m < n) {
                    maior = n;
                    menor = m;
                }

                int Sum = 0;
                for (int i = menor; i <= maior; i++) {
                    System.out.print(i + " ");
                    Sum = Sum + i;
                }
                System.out.println("Sum=" + Sum);

                m = sc.nextInt();
                n = sc.nextInt();
        }

        sc.close();
    }
    
}
