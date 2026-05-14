package Exercicios_Udemy_Java_Primeiros_Passos.Aula28_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A, B, C; // A = Base, C = Altura e B = Lado;
        double Triangulo, Circulo, Trapezio, Quadrado, Retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        Triangulo = (A * C) / 2.0;
        Circulo = 3.14159 * Math.pow(C,2);
        Trapezio = ((A + B) * C) / 2.0;
        Quadrado = B * B;
        Retangulo = A * B;

        System.out.printf("Triangulo: %.3f%n", Triangulo);
        System.out.printf("Circulo: %.3f%n", Circulo);
        System.out.printf("Trapezio: %.3f%n", Trapezio);
        System.out.printf("Quadrado: %.3f%n", Quadrado);
        System.out.printf("Retangulo: %.3f%n", Retangulo);

        sc.close();
    }
    
}
