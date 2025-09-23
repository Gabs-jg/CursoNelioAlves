package Seção13.Exemplo1.src.Application;

import Seção13.Exemplo1.src.Entities.Account;
import Seção13.Exemplo1.src.Entities.BusinessAccount;
import Seção13.Exemplo1.src.Entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200);
        System.out.println(acc.getalance());
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc2.withdraw(200);
        System.out.println(acc2.getalance());
        Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
        acc3.withdraw(200);
        System.out.println(acc3.getalance());

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        // BusinessAccount acc5 = (BusinessAccount)acc3; -> Dá errado

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
