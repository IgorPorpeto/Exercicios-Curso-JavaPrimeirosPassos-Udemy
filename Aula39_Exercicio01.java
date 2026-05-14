package Exercicios_Udemy_Java_Primeiros_Passos;

import java.util.Locale;
import java.util.Scanner;

public class Aula39_Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int plano = 100; // 100 minutos de telefone
        System.out.print("Digite o a quantidade de minutos: ");
        int minutos = sc.nextInt();
        double valor = 50.00; // valor do plano

        double excedente = 2.00; // valor do minuto excedente
        
        if (minutos > plano){
            int total = minutos - plano;
            double acrescimo = total * excedente;
            valor += acrescimo;
            System.out.printf("Valor a pagar: R$ %.2f\n", valor);
        }
        else {
            System.out.printf("Valor a pagar: R$ %.2f\n", valor);
        }
        sc.close();
    }
}
