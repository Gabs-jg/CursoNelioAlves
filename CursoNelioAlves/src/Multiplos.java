import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();
        if(n1%2==0 && n2%2==0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }
        sc.close();
    }
}