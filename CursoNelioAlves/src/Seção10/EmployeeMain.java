package Seção10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        System.out.println();

        List<Employee> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println();

            list.add(i, new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        System.out.println("\nList of employees: ");
        for(Employee obj : list) {
            System.out.print(obj);
        }

        sc.close();
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
