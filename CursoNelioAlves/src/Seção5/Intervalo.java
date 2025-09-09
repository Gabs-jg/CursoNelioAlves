package Seção5;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para verificar o intervalo: ");
        double numero = sc.nextDouble();

        if (numero > 100.0 || numero < 0.0) {
            System.out.println("Fora do intervalo");
        } else if (numero >=0 && numero <= 25.00) {
            System.out.println("Intervalo (0, 25)");
        } else if (numero <= 50 ) {
            System.out.println("Intervalo (25, 50)");
        } else if (numero <= 75) {
            System.out.println("Intervalo (75, 100)");
        } else {
            System.out.println("Intervalo (75, 100)");
        }

        sc.close();
    }
}
