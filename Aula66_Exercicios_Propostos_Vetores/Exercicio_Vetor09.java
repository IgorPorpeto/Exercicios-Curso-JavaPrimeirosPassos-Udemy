package Exercicios_Udemy_Java_Primeiros_Passos.Aula66_Exercicios_Propostos_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] mercadoria = new String[n];
        double[] precoCompra = new double[n];
        double[] precoVenda = new double[n];

        for (int i = 0; i < n; i++) {
            mercadoria[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
        }

        int lucroAbaixo10 = 0;
        int lucroEntre10e20 = 0;
        int lucroAcimaDe20 = 0;

        for (int i = 0; i < n; i++) {
            double lucro = precoVenda[i] - precoCompra[i];
            double porcentagem = (lucro / precoCompra[i]) * 100.0;

            if (porcentagem < 10.0) {
                lucroAbaixo10++;
            }
            else if (porcentagem <= 20) {
                lucroEntre10e20++;
            }
            else {
                lucroAcimaDe20++;
            }
        }
        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcimaDe20);

        double totalCompra = 0.0;
        double totalVenda = 0.0;

        for (int i = 0; i < n; i++) {
            totalCompra = totalCompra + precoCompra[i];
            totalVenda = totalVenda + precoVenda[i];
        }
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        
        double lucroTotal = totalVenda - totalCompra;
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        sc.close();
    }
    
}