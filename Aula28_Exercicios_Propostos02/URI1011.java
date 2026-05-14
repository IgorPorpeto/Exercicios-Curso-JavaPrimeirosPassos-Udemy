package Exercicios_Udemy_Java_Primeiros_Passos.Aula28_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double R, VOL;

        R = sc.nextDouble();

        VOL = (4.0 / 3.0) * 3.14159 * Math.pow(R,3);

        System.out.printf("VOLUME = %.3f%n", VOL);



        sc.close();
    }
    
}