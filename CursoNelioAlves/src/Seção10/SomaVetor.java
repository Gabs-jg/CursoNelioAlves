package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i< vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.print("Values = ");
        for(int i=0; i< vect.length; i++) {
            System.out.print(vect[i] + "  ");
        }
        System.out.println();
        double average = sum / vect.length;

        System.out.printf("Sum = %.2f%nAverage = %.2f%n", sum, average);

        sc.close();
    }
}
