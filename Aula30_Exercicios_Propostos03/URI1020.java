package Exercicios_Udemy_Java_Primeiros_Passos.Aula30_Exercicios_Propostos03;

import java.util.Locale;
import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, ano, resto, mes, dia;

        idade = sc.nextInt();

        ano = idade / 365;
        resto = idade % 365;

        mes = resto / 30;
        dia = resto % 30;

        System.out.println(ano + " anos (s)");
        System.out.println(mes + " mes (es)");
        System.out.println(dia + " dia (s)");

        sc.close();
    }
    
}
