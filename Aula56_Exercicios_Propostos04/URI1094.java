package Exercicios_Udemy_Java_Primeiros_Passos.Aula56_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int coelho = 0;
        int rato = 0;
        int sapo = 0;

        for (int i = 0; i < N; i++) {
            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);

            if (tipo == 'C') {
                coelho = coelho + quantidade;
            }
            else if (tipo == 'R') {
                rato = rato + quantidade;
            }
            else {
                sapo = sapo + quantidade;
            }
        }

        int total = coelho + rato + sapo;
        double porcentagemCoelho = (double) coelho / total * 100.0;
        double porcentagemRato = (double) rato / total * 100.0;
        double porcentagemSapo = (double) sapo / total * 100.0;

        System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemCoelho);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemRato);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemSapo);

        sc.close();
    }
    
}
