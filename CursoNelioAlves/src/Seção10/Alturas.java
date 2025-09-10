package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int ageUnderSixteen = 0;

        System.out.print("How many people will be typed: ");
        int n = sc.nextInt();
        People[] vect = new People[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Data of person #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();

            vect[i] = new People(name, age, height);
            sum += vect[i].getHeight();

            if (vect[i].getAge() < 16) {
                ageUnderSixteen++;
            }
        }


        double percentage = (double) ageUnderSixteen / vect.length * 100;
        double average = sum / vect.length;
        System.out.printf("Average height: %.2f%nPersons under 16 years of age: %.1f%%%n", average, percentage);
        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
