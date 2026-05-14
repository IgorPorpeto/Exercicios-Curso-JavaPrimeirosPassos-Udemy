package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if (A + B > C && B + C > A && C + A > B) {
            double Perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f", Perimetro);
        }
        else {
            double Area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f", Area);
        }


        sc.close();
    }
    
}
