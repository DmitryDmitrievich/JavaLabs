package lab2.model;

import java.util.Arrays;

public class Group {
    private String groupName;
    private int numberOfStudents;
    private Student[] student;

    public Group(String groupName, int numberOfStudents, Student[] student) {
        this.groupName = groupName;
        this.numberOfStudents = numberOfStudents;
        this.student = student;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return  "Group name '" + groupName + '\''+
                "Number of students: " + numberOfStudents +"\n\t\t\t\t\t\t\t\t\t"+
                "Student " + Arrays.toString(student)+"\n\t\t\t\t\t\t\t\t " ;
    }
}
