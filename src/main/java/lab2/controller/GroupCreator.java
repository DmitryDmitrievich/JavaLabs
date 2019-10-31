package lab2.controller;

import lab2.model.Group;
import lab2.model.Student;

import java.util.Scanner;

public class GroupCreator {
    private Scanner scanner;
    private static int size;

    public GroupCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getGroupName(){
        System.out.println("Enter group name");
        return scanner.next();
    }
    private int getNumberOfStudents(){
        System.out.println("Enter number of students");
        size = scanner.nextInt();
        return size;
    }

    public Group createGroup() {
        Group g = new Group(getGroupName(), getNumberOfStudents(), getGroupStudents());
        return g;
    }

    private Student[] getGroupStudents() {
        Student[] s = new Student[size];
        StudentCreator c = new StudentCreator(scanner);
        for (int i = 0; i < s.length; i++) {
            s[i] =  c.createStudent();
        }
        return s;
    }
}
