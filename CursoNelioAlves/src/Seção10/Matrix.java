package Seção10;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the matrix: ");
        int m = sc.nextInt(); // rows - linhas
        int n = sc.nextInt(); // columns - colunas
        int[][] mat = new int[m][n];

        for(int i=0; i< mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for(int i=0; i< mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j);
                    if(j - 1 >= 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(j + 1 < mat[i].length) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i - 1 >= 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(i + 1 < mat.length) {
                        System.out.println("Down " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
