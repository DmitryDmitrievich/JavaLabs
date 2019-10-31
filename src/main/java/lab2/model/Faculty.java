package lab2.model;

import java.util.Arrays;

public class Faculty {
    private String facultyName;
    private int numberOfDepartments;
    private Department[] department;

    public Faculty(String facultyName, int numberOfDepartments, Department[] department){
        this.facultyName = facultyName;
        this.numberOfDepartments = numberOfDepartments;
        this.department = department;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public Department[] getD() {
        return department;
    }

    public void setD(Department[] d) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Faculty name:'" + facultyName + '\''+
                "Number of departments: " + numberOfDepartments +"\n\t\t\t\t\t"+
                "Department " + Arrays.toString(department)+"\n\t\t\t\t\t ";
    }
}
