package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1051 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double imposto;
        double salario = sc.nextDouble();

        if (salario <= 2000.00) {
            imposto = 0.0;
        }
        else if (salario <= 3000.00) { 
            imposto = (salario - 2000.00) * 0.08; 
        }
        else if (salario <= 4500.00) { 
            imposto = ((salario - 3000.00) * 0.18) + (1000.00 * 0.08);
        }
        else {
            imposto = ((salario - 4500.00) * 0.28) + (1500.00 * 0.18) + (1000.00 * 0.08);
        }

        if (imposto == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
        
            
    sc.close();        
    }
            
}
    
