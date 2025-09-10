package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.print("How many elements will there be in the vector? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / vect.length;

        System.out.printf("Vector average: %.3f%n", average);
        System.out.println("Elements below average:");
        for(int i=0; i<vect.length; i++) {
            if(vect[i] < average) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
