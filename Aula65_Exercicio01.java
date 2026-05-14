package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula65_Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de Vetores: ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
    
        System.out.println("Digite os nomes a serem adicionados ao Vetor:");
        for (int i = 0; i < n; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("Nomes lidos:");

        for (String s : nomes) {
            System.out.println(s);
        }

        sc.close();
    }
}
