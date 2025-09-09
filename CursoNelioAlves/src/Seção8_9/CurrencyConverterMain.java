package Seção8_9;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(dollarPrice, amount);

        System.out.printf("Amount to be paid in reais %.2f%n", result);

        sc.close();
    }
}
