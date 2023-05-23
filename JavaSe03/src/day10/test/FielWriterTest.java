package day10.test;


import java.io.FileWriter;
import java.io.IOException;

public class FielWriterTest {
    public static void main(String[] args) {
        try {
            FileWriter wr = new FileWriter("而非");
            wr.write("sef");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
