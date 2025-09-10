package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int quantitypairs = 0;

        System.out.print("How many elements will the vector have? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
            if(vect[i] % 2 == 0) {
                sum += vect[i];
                quantitypairs++;
            }
        }

        if(quantitypairs > 0) {
            double average = sum/quantitypairs;
            System.out.println("Peer average: " + average);
        } else {
            System.out.println("No even number");
        }

        sc.close();
    }
}
