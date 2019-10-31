package lab2.controller;

import lab2.model.Department;
import lab2.model.Faculty;
import lab2.model.Group;

import java.util.Scanner;

public class DepartmentCreator {
    private Scanner scanner;
    private static int size;

    public DepartmentCreator(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getDepartmentName(){
        System.out.println("Enter department name");
        return scanner.next();
    }
    private int getNumberOfGroups(){
        System.out.println("Enter number of groups");
        size = scanner.nextInt();
        return size;
    }

    public Department createDepartment(){
        Department d = new Department(getDepartmentName(), getNumberOfGroups(), getDepartmentGroups());
        return d;
    }

    private Group[] getDepartmentGroups() {
        Group[] g = new Group[size];
        GroupCreator c = new GroupCreator(scanner);
        for (int i = 0; i < g.length; i++) {
            g[i] =  c.createGroup();
        }
        return g;
    }
}
