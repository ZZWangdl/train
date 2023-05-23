package day10.test.seriliz;

import sun.management.Agent;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -684979447075466755L;
    String name;
     int age;
     String gender;

    public Student(String name,int age) {
        this.name = name;
          this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name;
    }
}
