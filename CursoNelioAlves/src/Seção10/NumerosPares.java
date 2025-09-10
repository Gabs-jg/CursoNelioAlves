package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityPairs = 0;

        System.out.print("How many numbers you will type? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
            if(vect[i]%2 == 0) {
                quantityPairs++;
            }
        }

        System.out.println("Even numbers:");
        for(int i=0; i<vect.length; i++) {
            if(vect[i] % 2 == 0) {
                System.out.print(vect[i] + "  ");
            }
        }

        System.out.println();
        System.out.print("Number of pairs: " + quantityPairs);

        sc.close();
    }
}
