package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Enter the value of vector A:");
        for(int i=0; i<vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        System.out.println("Enter the value of vector B:");
        for(int i=0; i<vectB.length; i++) {
            vectB[i] = sc.nextInt();
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Resulting vector:");
        for(int i=0; i<vectC.length; i++) {
            System.out.println(vectC[i]);
        }

        sc.close();
    }
}
