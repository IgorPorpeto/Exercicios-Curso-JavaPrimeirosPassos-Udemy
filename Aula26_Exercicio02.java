package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula26_Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B; // A = Base , B = Altura.
        double Area, Perimetro, Diagonal;

        System.out.println("<< Retangulo >>");
        System.out.println();

        System.out.println("Digite o Valor da Base: ");
        A = sc.nextDouble();
        System.out.println();

        System.out.println("Digite o Valor da Altura: ");
        B = sc.nextDouble();
        System.out.println();

        Area = A * B;
        Perimetro = (2 * A) + (2 * B);
        Diagonal = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));

        System.out.printf("Area = %.4f%n", Area);
        System.out.printf("Perimetro = %.4f%n", Perimetro);
        System.out.printf("Diagonal = %.4f%n", Diagonal);

        sc.close();
    }
    
}
