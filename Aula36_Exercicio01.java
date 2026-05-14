package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula36_Exercicio01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1, n2, notafinal;

        System.out.println("Digite as 2 notas de Aluno:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println();

        notafinal = n1 + n2;

        System.out.printf("Nota Final: %.1f%n", notafinal);

        if (notafinal < 60) {
            System.out.println("Reprovado.");    
        }
        
        sc.close();
    }    
}
