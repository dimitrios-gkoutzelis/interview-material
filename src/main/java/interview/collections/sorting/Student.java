package main.java.interview.collections.sorting;

public class Student implements Comparable<Student> {

    private String studentName;
    private int rollNo;
    private int age;

    public Student(String studentName, int rollNo, int age) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /** We took an arbitrary decision here to choose age as our basis for sorting Student objects. */
    @Override
    public int compareTo(Student student) {
        return this.age - student.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }
}
