package Exercicios_Udemy_Java_Primeiros_Passos.Aula66_Exercicios_Propostos_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] sexo = new char[n];

        for (int i = 0; i < n; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        double menorAltura = altura[0];
        double maiorAltura = altura[0];
        double somaAlturaMulheres = 0.0;
        int numeroMulheres = 0;
        double mediaAlturaMulheres = 0.0;
        int numeroHomens = 0;

        for (int i = 0; i < n; i++) {
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);

        for (int i = 0; i < n; i++) {
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            }
        }
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'F') {
                somaAlturaMulheres = somaAlturaMulheres + altura[i];
                numeroMulheres++;
            }
        }

        if (numeroMulheres == 0) {
            System.out.println("Nao ha nenhuma mulher dentre as pessoas");
        }
        else {
            mediaAlturaMulheres = somaAlturaMulheres / numeroMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        }
        
        
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'M') {
                numeroHomens++;
            }
        }
        System.out.println("Numero de homens = " + numeroHomens);


        sc.close();
    }
    
}