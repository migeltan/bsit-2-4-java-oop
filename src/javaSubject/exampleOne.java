package javaSubject;

public class exampleOne { // Only one brace here

    static String companyName = "ABC Corp";
    String employeeName;

    public void showSalary() {
        double salary = 25000;
        System.out.println(employeeName + " - " + salary);
    }

    public static void main(String[] args) {
        // Use the actual class name: exampleOne
        exampleOne e1 = new exampleOne();
        exampleOne e2 = new exampleOne();

        e1.employeeName = "Juan";
        e2.employeeName = "Maria";

        e1.showSalary();
        e2.showSalary();
    }
}