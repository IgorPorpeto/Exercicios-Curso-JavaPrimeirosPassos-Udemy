package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1158 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int soma = 0;
            int contador = 0;

            for (int j = X; contador < Y; j++) {
                if (j % 2 != 0) {
                    soma = soma + j;
                    contador = contador + 1;
                }

            }
            System.out.println(soma);
        }

        sc.close();
    }
    
}
