package lab2.model;

import java.util.Arrays;

public class Department {
    private String departmentName;
    private int numberOfGroups;
    private Group[] group;

    public Department(String departmentName, int numberOfGroups, Group[] group){
        this.departmentName = departmentName;
        this.numberOfGroups = numberOfGroups;
        this.group = group;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return  "Department name'" + departmentName + '\''+
                "Number of groups: " + numberOfGroups +"\n\t\t\t\t\t\t\t"+
                "Group " + Arrays.toString(group)+"\n\t\t\t\t\t\t\t " ;
    }
}
