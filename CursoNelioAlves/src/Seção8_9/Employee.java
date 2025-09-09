package Seção8_9;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    public String toString() {
        return String.format("%s, $ %.2f", name, netSalary());
    }
}
