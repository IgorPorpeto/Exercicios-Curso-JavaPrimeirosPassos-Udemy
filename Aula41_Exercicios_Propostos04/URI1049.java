package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String Tipo1 = sc.nextLine();
        String Tipo2 = sc.nextLine();
        String Tipo3 = sc.nextLine();

        if (Tipo1.equals("vertebrado")) {
            if (Tipo2.equals("ave")) {
                if (Tipo3.equals("carnivoro")) {
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else {
                if (Tipo3.equals("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }
        else {
            if (Tipo2.equals("inseto")){
                if (Tipo3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else {
                if (Tipo3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
    
}