package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula47_Exercicio01{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();

        while(x != y) {
        
            if (x > y) {
                System.out.println("Decrescente");
            }
            else {
                System.out.println("Crescente");
            }

            x = sc.nextInt();
            y = sc.nextInt();
            
        }    
        

        sc.close();
    }
    
}