package Seção10;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people are you going to type? ");
        int n = sc.nextInt();
        People[] vect = new People[n];
        String olderPerson = "";
        int olderAge = 0;

        for(int i=0; i< vect.length; i++) {
            sc.nextLine();
            System.out.println("Person data #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();

            vect[i] = new People(name, age);
            if(vect[i].getAge() > olderAge) {
                olderAge = vect[i].getAge();
                olderPerson = vect[i].getName();
            }
        }

        System.out.println("Older person: " + olderPerson);

        sc.close();
    }
}
