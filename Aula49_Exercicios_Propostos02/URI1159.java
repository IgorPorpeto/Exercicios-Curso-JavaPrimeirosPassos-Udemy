package Exercicios_Udemy_Java_Primeiros_Passos.Aula49_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Pedi um numero inteiro

        while (x != 0) { // X diferente de zero, zero termina o programa
            if (x % 2 != 0) { // Verifica se o valor é impar pelo valor do resto da divisão
                x = x +1; // Encrementa + 1 em numero impar
            }
            
            int soma = x + x + 2 + x + 4 + x + 6 + x + 8; // Soma 5 numeros pares proximos de X
            System.out.println(soma); // Imprime a soma

            x = sc.nextInt(); // Pedi outro numero inteiro
        }

        sc.close();
    }
    
}
