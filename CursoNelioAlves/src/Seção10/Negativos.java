package Seção10;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? (Max 10): ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers:");
        for(int i=0; i<vect.length; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
