package Seção10;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be typed? ");
        int n = sc.nextInt();
        Student[] vect = new Student[n];

        for(int i=0; i<vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter the name, first and second grades of the student #" + (i+1) + ": ");
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();

            vect[i] = new Student(name, grade1, grade2);
        }

        System.out.println("Approved students:");
        for(int i=0; i<vect.length; i++) {
            if(vect[i].getAverage() >= 6) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
