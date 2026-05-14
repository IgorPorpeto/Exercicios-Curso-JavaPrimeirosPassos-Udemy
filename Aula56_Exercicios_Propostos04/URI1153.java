package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1153 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fatoracao = 1;

        for ( int i = 1; i <= n; i++) {
            fatoracao = fatoracao * i;
        }

        System.out.println(fatoracao);

        sc.close();
    }
    
}
