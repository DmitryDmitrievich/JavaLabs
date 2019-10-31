package lab2;

import lab2.controller.UniversityCreator;
import lab2.model.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversityCreator c = new UniversityCreator(new Scanner(System.in));
        University u = c.createUniversity();
        System.out.println(u.toString());
    }

}
