package day03;

import day02.test3.Student;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {
        Student s1 = new Student(22);
        Student s2 = new Student(25);
        Student s3 = new Student(4);
        Student s4 = new Student(233);
        Student[] stu = {s1,s2,s4,s3};
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }
}
