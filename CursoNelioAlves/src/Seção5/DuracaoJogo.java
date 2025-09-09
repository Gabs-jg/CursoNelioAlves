package Seção5;

import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicio, horaFinal;
        int duracao = 0;

        System.out.print("Digite a hora inicial: ");
        horaInicio = sc.nextInt();

        System.out.print("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if(horaInicio > horaFinal) {
            duracao = (24 - horaInicio) + horaFinal;
        } else{
            duracao = 24 - horaFinal + horaInicio;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");

        sc.close();
    }
}
