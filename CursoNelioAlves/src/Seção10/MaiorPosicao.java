package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.print("Enter a number: ");
        vect[0] = sc.nextDouble();
        double greaterValue = vect[0];
        int highestValueIndex = 0;

        for(int i=1; i<vect.length; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
            if(vect[i] > greaterValue) {
                greaterValue = vect[i];
                highestValueIndex = i;
            }
        }

        System.out.printf("Maior valor: %.1f%nPosição do maior valor = %d%n", greaterValue, highestValueIndex);

        sc.close();
    }
}
