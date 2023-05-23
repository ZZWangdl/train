package day02.test3;

public class Student implements Comparable<Student>{
    int age=20;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    public Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student stu) {
        return this.age- stu.age;
    }
}
