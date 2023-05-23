package day10.test.seriliz;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputSerial {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\we\\test\\seriable2.txt"));

            Person st = (Person) in.readObject();
            Person s2 = (Person) in.readObject();
            System.out.println(s2);
            System.out.println(st);
        } catch (IOException | ClassNotFoundException e) {
        }
    }
}
