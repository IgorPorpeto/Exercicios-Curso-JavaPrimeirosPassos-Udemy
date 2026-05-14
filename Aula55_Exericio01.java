package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula55_Exericio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor Celsius para Fahrenheit");
        System.out.println(); // Pula Linha

        char Resposta;

        do {        
            System.out.print("Digite o valor a Temperatura em Celsius: ");
            double Celsius = sc.nextDouble();
            
            double Fahrenheit = ((9 * Celsius) / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", Fahrenheit);
            System.out.println(); // Pula Linha

            System.out.print("Deseja repetir (s/n)? ");
            Resposta = sc.next().charAt(0); // Utiliza Letra
        } while (Resposta != 'n'); // Aspas obrigatorio quando letra

        sc.close();
    }
    
}