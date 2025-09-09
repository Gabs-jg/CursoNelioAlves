package Seção8_9;

import java.util.Locale;
import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();
        System.out.print("Enter rectangle height: ");
        double height = sc.nextDouble();

        Rectangle ret = new Rectangle(width, height);
        System.out.printf("Area = %.2f%n", ret.area());
        System.out.printf("Perimenter = %.2f%n", ret.perimeter());
        System.out.printf("Diagonal = %.2f%n", ret.diagonal());

        sc.close();
    }
}
