package Seção10;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] vect = new Student[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Student(name, email);
        }

        System.out.println("Busy rooms: ");
        for(int i=0; i< vect.length; i++) {
            if(vect[i] != null) {
                System.out.printf("%d: %s, %s%n", i, vect[i].getName(), vect[i].getEmail());
            }
        }

        sc.close();
    }
}
