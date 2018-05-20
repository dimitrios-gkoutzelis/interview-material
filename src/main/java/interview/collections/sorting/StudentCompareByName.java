package main.java.interview.collections.sorting;

import java.util.Comparator;

public class StudentCompareByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getStudentName().compareTo(student2.getStudentName());
    }
}
