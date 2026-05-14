package Exercicios_Udemy_Java_Primeiros_Passos.Aula41_Exercicios_Propostos04;

import java.util.Locale;
import java.util.Scanner;

public class URI1047 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int HoraInicial, MinutoInicial, HoraFinal, MinutoFinal, Inicio, Final, Horas, Minutos, Tempo;

        HoraInicial = sc.nextInt();
        MinutoInicial = sc.nextInt();
        HoraFinal = sc.nextInt();
        MinutoFinal = sc.nextInt();

        Inicio = (HoraInicial * 60) + MinutoInicial;
        Final = (HoraFinal * 60) + MinutoFinal;

        if (Inicio < Final) {
            Tempo = Final - Inicio;
        }
        else {
            Tempo = ((24 * 60) - Inicio) + Final;
        }

        Horas = Tempo / 60;
        Minutos = Tempo % 60;    

        System.out.println("O JOGO DUROU " + Horas + " HORA(S) E " + Minutos + " MINUTO(S)");

        sc.close();
    }
    
}
