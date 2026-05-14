package Exercicios_Udemy_Java_Primeiros_Passos.Aula28_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, d ,e;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = (a + b + Math.abs(a - b)) / 2;
        e = (d + c + Math.abs(d - c)) / 2;

        System.out.println(e + " eh o maior");

        sc.close();
    }
    
}
