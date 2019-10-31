package lab2.model;

import java.util.Arrays;

public class University{
    private String universityName;
    private int numberOfFaculties;
    private Faculty[] faculty;

    public University(String universityName,  int numberofFaculties, Faculty[] faculty){
        this.universityName = universityName;
        this.numberOfFaculties = numberofFaculties;
        this.faculty = faculty;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public Faculty[] getF() {
        return faculty;
    }

    public void setF(Faculty[] f) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "University name: '" + universityName + '\''+"\n\t\t" +
                "Number of faculties: " + numberOfFaculties +"\n\t\t\t"+
                "Faculty " + Arrays.toString(faculty);
    }
}
