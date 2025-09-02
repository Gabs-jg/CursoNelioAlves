package Seção4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();
        double areaTriangulo = (a * c)/2;
        double pi = 3.14159;
        double areaCirculo = pi * (c*c);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b*b;
        double areaRetangulo = a*b;
        System.out.printf("Triangulo: %.3f\nCirculo: %.3f\nTrapezio: %.3f\nQuadrado: %.3f\nRetangulo: %.3f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
        sc.close();
    }
}
