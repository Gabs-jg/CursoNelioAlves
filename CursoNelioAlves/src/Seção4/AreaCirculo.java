package Seção4;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double pi = 3.14159;
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();
        double area = pi * (raio*raio);
        System.out.printf("A=%.4f", area);
        sc.close();
    }
}
