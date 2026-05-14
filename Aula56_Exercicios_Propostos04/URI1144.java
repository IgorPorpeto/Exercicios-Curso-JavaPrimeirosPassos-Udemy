package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1144 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado +" " + cubo);
            System.out.printf("%d %d %d%n", i, quadrado + 1, cubo + 1);
        }

        sc.close();
    }
    
}
