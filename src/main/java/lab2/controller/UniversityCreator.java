package lab2.controller;

import lab2.model.Faculty;
import lab2.model.University;
import java.util.Scanner;

public class UniversityCreator {
    private static Scanner scanner;
    private static int size;

    public UniversityCreator (Scanner scanner){
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getUniversityName(){
        System.out.println("Enter university name");
        return scanner.nextLine();
    }
    private int getNumberOfFaculties(){
        System.out.println("Enter number of faculties");
        size = scanner.nextInt();
        return size ;
    }
    public University createUniversity(){
       University u = new University(getUniversityName(),getNumberOfFaculties(), getUniversityFaculties());
        return u;
    }
    private Faculty[] getUniversityFaculties() {
        Faculty[] f = new Faculty[size];
        FacultyCreator c = new FacultyCreator(scanner);
        for (int i = 0; i < f.length; i++) {
            f[i] =  c.createFaculty();
        }
        return f;
    }

}
