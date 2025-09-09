package Seção8_9;

import java.util.Locale;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = sc.nextLine();
        System.out.print("Enter grade 1: ");
        double grade1 = sc.nextDouble();
        System.out.print("Enter grade 2: ");
        double grade2 = sc.nextDouble();
        System.out.print("Enter grade 3: ");
        double grade3 = sc.nextDouble();

        Student stu = new Student(name, grade1, grade2, grade3);

        System.out.println(stu);

        sc.close();
    }
}
