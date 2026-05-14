package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1042 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int um = 0;
        int dois = 0;
        int tres = 0;

        if (a < b && a < c) {
            um = a;
            if (b < c) {
            dois = b;
            tres = c;
            } else {
            dois = c;
            tres = b;
            }
        }

        if (b < c && b < a) {
            um = b;
            if (c < a) {
            dois = c;
            tres = a;
            } 
            else {
            dois = a;
            tres = c;
            }
        }

        if (c < a && c < b) {
            um = c;
            if (b < a) {
            dois = b;
            tres = a;
            } 
            else {
            dois = a;
            tres = b;
            }
        }

        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
    
}