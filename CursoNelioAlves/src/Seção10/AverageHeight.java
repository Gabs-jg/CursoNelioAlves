package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class AverageHeight {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double values = 0;

        System.out.print("Enter how many heights you want to read: ");
        int n = sc.nextInt();

        double[] vect = new double [n];

        for(int i=0; i<vect.length; i++) {
            vect[i] = sc.nextDouble();
            values += vect[i];
        }

        double average = values/vect.length;
        System.out.printf("Average height: %.2f%n", average);

        sc.close();
    }
}
