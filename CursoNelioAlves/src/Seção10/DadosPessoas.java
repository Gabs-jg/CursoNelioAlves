package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many person will be typed? ");
        int n = sc.nextInt();
        People[] vect = new People[n];
        int countMale = 0;
        double greaterHeight = Double.NEGATIVE_INFINITY;
        double shorterHeight = Double.POSITIVE_INFINITY;
        double sum = 0;


        for(int i=0; i<vect.length; i++) {
            System.out.print("Height of person #" + (i+1) + ": ");
            double height = sc.nextDouble();
            System.out.print("Gender of person #" + (i+1) + ": ");
            char gender = sc.next().charAt(0);

            vect[i] = new People(height, gender);

            if(height > greaterHeight) {
                greaterHeight = height;
            }
            if(height < shorterHeight) {
                shorterHeight = height;
            }
            if(Character.toUpperCase(gender) == 'M') {
                countMale++;
            } else if(Character.toUpperCase(gender) == 'F') {
                sum += height;
            }
        }

        double average = sum / (vect.length - countMale);

        System.out.printf("Shorter height = %.2f%n" +
                "Greater height = %.2f%n" +
                "Average height of women = %.2f%n" +
                "Number of men = %d", shorterHeight, greaterHeight, average, countMale);

        sc.close();
    }
}
