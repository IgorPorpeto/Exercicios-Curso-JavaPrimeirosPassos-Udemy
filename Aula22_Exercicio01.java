package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula22_Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y, area;
        double z, preco;

        System.out.println("Terreno:");
        System.out.println("Digite a Largura do Terreno: ");
        x = sc.nextDouble();
        System.out.println();

        System.out.println("Digite o Comprimento do Terreno:");
        y = sc.nextDouble();
        System.out.println();

        System.out.println("Digite o Valor do Metro Quadrado:");
        z = sc.nextDouble();
        System.out.println();

        area = x * y;
        preco = z * area;

        System.out.printf("Largura: %.1f m%n", x);
        System.out.printf("Comprimento: %.1f m%n", y);
        System.out.printf("Area do Terreno: %.2f m2%n", area);
        System.out.println();

        System.out.printf("Valor Metro Quadrado: R$ %.2f%n", z);
        System.out.printf("Preço do Terreno: R$ %.2f%n", preco);

        sc.close();
    
    }
}