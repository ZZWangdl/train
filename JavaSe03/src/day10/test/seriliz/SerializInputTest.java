package day10.test.seriliz;

import day10.test.seriliz.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializInputTest {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\we\\test\\seriable.txt"));

            Student st = (Student) in.readObject();
            Student s2 = (Student) in.readObject();
            System.out.println(s2);
            System.out.println(st);
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
