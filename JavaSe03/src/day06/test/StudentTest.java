package day06.test;

import java.util.Objects;

public class StudentTest implements Comparable<StudentTest> {
    String name;
    int age;

    public StudentTest() {
    }

    @Override
    public String
    toString() {
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof StudentTest)) return false;
        StudentTest that = (StudentTest) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public StudentTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(StudentTest o) {
        return this.age-o.age;
    }
}
