package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maior = sc.nextInt();
        int posicao = 1;

        for (int i= 2; i <= 100; i++) {
            int x = sc.nextInt();

            if (x > maior) {
                maior = x;
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);

        sc.close();
    }
    
}
