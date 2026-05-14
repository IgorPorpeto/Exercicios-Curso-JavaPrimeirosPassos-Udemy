package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula64_Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Vetores: ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        System.out.println("Digite os valores a serem adicionados ao Vetor: Nome Idade Altura");

        for (int i = 0; i < n; i++) {
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        double alturaTotal = 0.0;
        for (int i = 0; i < n; i++) {
            alturaTotal = alturaTotal + altura[i];
        }
        double alturaMedia = alturaTotal / n;
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                contador = contador + 1;
            }
        }
        double porcentagem = (contador * 100.0) / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        sc.close();
    }
    
}