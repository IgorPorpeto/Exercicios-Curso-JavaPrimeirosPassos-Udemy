package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores não aceitos");
        }
            
        sc.close();
    }
}