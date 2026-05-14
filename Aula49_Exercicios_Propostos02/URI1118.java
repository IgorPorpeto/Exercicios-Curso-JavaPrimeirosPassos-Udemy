package Exercicios_Udemy_Java_Primeiros_Passos.Aula49_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int novoCalculo = 1; // Inicia novo Calculo com valor 1

        while (novoCalculo == 1) {
            double nota1 = sc.nextDouble(); // Pedi a primeira nota

            while (nota1 < 0.0 || nota1 > 10.0) {
                System.out.println("nota invalida"); // Nota fora do escopo "nota invalida"
                nota1 = sc.nextDouble(); // Pedi novamente caso nota esteja fora do escopo               
            }

            double nota2 = sc.nextDouble(); // Pedi segunda nota

            while (nota2 < 0.0 || nota2 > 10.0) {
                System.out.println("nota invalida"); // Nota fora do escopo "nota invalida"
                nota2 = sc.nextDouble(); // Pedi novamente caso nota esteja fora do escopo
            }

            double media = (nota1 + nota2) / 2.0; // Calculo da media
            System.out.printf("media = %.2f%n", media); // Imprime a media

            System.out.println("novo calculo (1-sim 2-nao)"); // Pergunta se quer fazer um novo calculo
            novoCalculo = sc.nextInt(); // Pedi 1 - Sim, 2 - Nao
            while (novoCalculo != 1 && novoCalculo != 2) {
                System.out.println("novo calculo (1-sim 2-nao)"); // Valor fora do escopo, pedi novamente
                novoCalculo = sc.nextInt(); // Pedi 1 - Sim, 2 - Nao
            }

        }        

        sc.close();
    }
    
}
