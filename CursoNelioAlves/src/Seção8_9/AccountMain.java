package Seção8_9;

import java.util.Locale;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double balance = 0;

        Account ac;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char option = sc.next().charAt(0);

        if(option == 'y') {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            ac = new Account(number, holder, balance);
        } else {
            ac = new Account(number, holder);
        }

        System.out.println("Account data:");
        System.out.println(ac);

        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        ac.deposit(balance);

        System.out.println("Updated account data:");
        System.out.println(ac);

        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        ac.withdraw(balance);

        System.out.println("Updated account data:");
        System.out.println(ac);

        sc.close();
    }
}
