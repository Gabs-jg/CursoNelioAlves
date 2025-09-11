package Seção10;

public class Student extends People {
    private double grade1, grade2, average;
    private String email;

    public Student(String name, double grade1, double grade2) {
        super(name);
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Student(String name, String email) {
        super(name);
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
