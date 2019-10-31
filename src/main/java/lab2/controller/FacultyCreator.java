package lab2.controller;

import lab2.controller.DepartmentCreator;
import lab2.model.Department;
import lab2.model.Faculty;

import java.util.Scanner;

public class FacultyCreator {
    private Scanner scanner;
    private static int size;

    public FacultyCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getFacultyName(){
        System.out.println("Enter faculty name");
        return scanner.next();
    }
    private int getNumberOfDepartments(){
        System.out.println("Enter number of departments");
        size = scanner.nextInt();
        return size;
    }
    public Faculty createFaculty(){
        Faculty f = new Faculty(getFacultyName(),getNumberOfDepartments(), getFacultyDepartments());
        return f;
    }
    private Department[] getFacultyDepartments(){
        Department[] d = new Department[size];
        DepartmentCreator c = new DepartmentCreator(scanner);
        for (int i = 0; i < d.length; i++) {
            d[i] =  c.createDepartment();
        }
        return d;
    }
}
