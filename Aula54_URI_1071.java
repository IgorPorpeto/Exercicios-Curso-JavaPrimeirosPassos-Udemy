package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula54_URI_1071 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Pedi valor de x
        int y = sc.nextInt(); // Pedi valor de y

        int minimo, maximo;
        if (x < y) {  // Verifica se x é menor que y ou vise versa
            minimo = x;
            maximo = y;
        }
        else {
            minimo = y;
            maximo = x;
        }

        int soma = 0;
        for (int i = minimo + 1; i < maximo; i++) {
            if (i % 2 != 0) { // Utiliza o resto da divisao para encontrar os valores impares
                soma = soma + i; // Soma os valores impares
            }
        }
        
        System.out.println(soma);

        sc.close();
    }
    
}
