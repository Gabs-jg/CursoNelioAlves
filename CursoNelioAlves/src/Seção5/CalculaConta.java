package Seção5;

import java.util.Locale;
import java.util.Scanner;

public class CalculaConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.println("======================================");
        System.out.println("| Codigo |  Especificação  | Preço   |");
        System.out.println("|   1    | Cachorro quente | R$ 4.00 |");
        System.out.println("|   2    |    X-Salada     | R$ 4.50 |");
        System.out.println("|   3    |    X-Bacon      | R$ 5.00 |");
        System.out.println("|   4    | Torrada Simples | R$ 2.00 |");
        System.out.println("|   5    |   Refrigerante  | R$ 1.50 |");
        System.out.println("======================================");

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            total = 4.0 * quantidade;
        } else if (codigo == 2) {
            total = 4.5 * quantidade;
        } else if (codigo == 3) {
            total = 5.0 * quantidade;
        } else if (codigo == 4) {
            total = 2.0 * quantidade;
        } else if (codigo == 5) {
            total = 1.5 * quantidade;
        }

        System.out.printf("Total: R$%.2f%n", total);

        sc.close();
    }
}
