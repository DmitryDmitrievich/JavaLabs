package lab2.model;

public class Student {
    private String studentName;
    private int age;

    public Student(String studentName, int age){
        this.studentName = studentName;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "Name '" + studentName + '\''+
                "Age=" + age ;
    }
}
