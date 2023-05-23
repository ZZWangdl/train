package day10.test.seriliz;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    //int age;

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name  ;
    }

    public Person(String name) {
        this.name = name;
        //this.age = age;
    }
}
