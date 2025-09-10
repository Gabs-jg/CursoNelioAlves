package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class AveragePrice {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        System.out.print("Enter the quantity of products: ");
        int n = sc.nextInt();
        Products[] vect = new Products[n];

        for(int i=0; i< vect.length; i++) {
            sc.nextLine();
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();
            System.out.print("Enter the price of the product: ");
            double price = sc.nextDouble();

            vect[i] = new Products(name, price);
            soma += vect[i].getPrice();
        }

        double average = soma / vect.length;

        System.out.printf("Average Price = %.2f", average);

        sc.close();
    }
}
