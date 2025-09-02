package Seção4;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor por hora trabalhada: ");
        double valorTrabalhado = sc.nextDouble();
        double salario = valorTrabalhado * horasTrabalhadas;
        System.out.printf("Number = %d\nSalary = U$ %.2f", numeroFuncionario, salario);
        sc.close();
    }
}
