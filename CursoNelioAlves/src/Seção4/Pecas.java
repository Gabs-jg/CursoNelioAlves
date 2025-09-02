package Seção4;

import java.util.Locale;
import java.util.Scanner;

public class Pecas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o código da peça 1: ");
        int codigo1 = sc.nextInt();
        System.out.print("Digite o número de peças da peça 1: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o valor da peça 1: ");
        double valor1 = sc.nextDouble();
        System.out.print("Digite o código da peça 2: ");
        int codigo2 = sc.nextInt();
        System.out.print("Digite o número de peças da peça 2: ");
        int numero2 = sc.nextInt();
        System.out.print("Digite o valor da peça 2: ");
        double valor2 = sc.nextDouble();
        double valorTotal = numero1*valor1 + numero2*valor2;
        System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
        sc.close();
        
    }
}
