package Seção8_9;

public class Student {
    public String nome;
    public double grade1, grade2, grade3;

    public Student(String nome, double grade1, double grade2, double grade3) {
        this.nome = nome;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public double gradeCalculation() {
        return grade1 + grade2 + grade3;
    }

    public String checkApproved() {
        if (gradeCalculation() >= 60.0) {
            return "PASS";
        } else {
            return String.format("FAILED%nMISSING %.2f POINTS", (60 - gradeCalculation()));
        }
    }

    public String toString() {
        return String.format("Final Grade: %.2f%n%s", gradeCalculation(), checkApproved());
    }
}
