package Exercicios_Udemy_Java_Primeiros_Passos.Aula25_Exercicios_Propostos01;

import java.util.Locale;
import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double area, raio;

        raio = sc.nextDouble();

        area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f%n", area);
        

        sc.close();
    }
}
