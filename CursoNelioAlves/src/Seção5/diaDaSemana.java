package Seção5;

import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número referente ao dia: ");

        int num = sc.nextInt();
        String dia;

        switch(num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabádo";
                break;
            default:
                dia = "valor inválido";
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
