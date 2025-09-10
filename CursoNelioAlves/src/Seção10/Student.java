package Seção10;

public class Student extends People {
    private double grade1, grade2, average;

    public Student(String name, double grade1, double grade2) {
        super(name);
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getAverage() {
        return (grade1 + grade2) / 2;
    }
}
