package lab2.controller;

import lab2.model.Student;

import java.util.Scanner;

public class StudentCreator {
    private Scanner scanner;

    public StudentCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
    private String getStudentName(){
        System.out.println("Enter student name");
        return scanner.next();
    }
    private int getStudentAge(){
        System.out.println("Enter student age");
        return scanner.nextInt();
    }

    public Student createStudent() {
        Student s = new Student(getStudentName(), getStudentAge());
        return s;
    }
}
