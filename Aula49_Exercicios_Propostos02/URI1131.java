package Exercicios_Udemy_Java_Primeiros_Passos.Aula49_Exercicios_Propostos02;

import java.util.Locale;
import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empates = 0;
        int novoGrenal = 1;

        while (novoGrenal == 1) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsInter > golsGremio) {
                vitoriaInter = vitoriaInter + 1;
            }
            else if (golsGremio > golsInter) {
                vitoriaGremio = vitoriaGremio + 1;
            }

            else {
                empates = empates + 1;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
        }

        int total = vitoriaGremio + vitoriaInter + empates;
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriaInter);
		System.out.println("Gremio:" + vitoriaGremio);
		System.out.println("Empates:" + empates);
		
		if (vitoriaInter > vitoriaGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriaGremio > vitoriaInter) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}

        sc.close();
    }
    
}
