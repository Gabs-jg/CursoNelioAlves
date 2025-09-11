package Seção10;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of the matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int count = 0;

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j< mat[i].length; j++) {
                //System.out.print("Enter the position value [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for(int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        System.out.println("Negative numbers = " + count);

        sc.close();
    }
}
