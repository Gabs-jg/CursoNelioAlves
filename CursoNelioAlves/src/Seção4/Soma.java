package Seção4;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro para somar: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número inteiro para somar: ");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.println("Seção4.Soma = " + soma);
        sc.close();
    }
}
